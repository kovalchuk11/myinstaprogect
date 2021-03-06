package myprogect.insta.controller;

import myprogect.insta.service.InfoAccService;
import myprogect.insta.service.Maina;
import myprogect.insta.model.Averagedata;
import myprogect.insta.model.TwoAcc;
import myprogect.insta.service.UpdateDB;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class MyController {
    @Autowired
    UpdateDB updateDB;
    @Autowired
    private Maina maina;
    @Autowired
    InfoAccService infoAccService;

    @RequestMapping
    public String showIndex() {
        return "index";
    }


    @RequestMapping(value = "/followers")
    public String showFollowers(Model model) {
        model.addAttribute("acc", new TwoAcc());
        return "followers";
    }

//    @RequestMapping (value = "/followers/submit")
//    public void getLogFile(HttpSession session, HttpServletResponse response) throws Exception {
//        try {
//            String filePathToBeServed = "C:\\Users\\I\\Downloads\\vechernie.posidelki.txt";
//                    File fileToDownload = new File(filePathToBeServed);
//            InputStream inputStream = new FileInputStream(fileToDownload);
//            response.setContentType("application/force-download");
//            response.setHeader("Content-Disposition", "attachment; filename=fileName.txt");
//            IOUtils.copy(inputStream, response.getOutputStream());
//            response.flushBuffer();
//            inputStream.close();
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }

    @RequestMapping(value = "/followers/submit", method = RequestMethod.POST)
    public ResponseEntity<byte[]> getDownloadData(@ModelAttribute TwoAcc acc) throws Exception {
        String[] username1 = acc.getFirst().split("/");
        String ol = username1[username1.length - 1];
        String massage = null;
        try {
            maina.start();
            massage = maina.getFollowers(acc.getFirst());
        } catch (Exception e) {
            e.printStackTrace();
        }
//        String regData = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        byte[] output = massage.getBytes();
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("charset", "utf-8");
        responseHeaders.setContentType(MediaType.valueOf("text/html"));
        responseHeaders.setContentLength(output.length);
        responseHeaders.set("Content-disposition", "attachment; filename=" + ol + ".txt");
        return new ResponseEntity<byte[]>(output, responseHeaders, HttpStatus.OK);
    }


    @RequestMapping(value = "/statistic")
    public String showStatistic(Model model) {
        model.addAttribute("infoAccs", infoAccService.getAll());
        return "statistic";
    }

    @RequestMapping(value = "/statistic/update")
    public String showStatistic() {
        updateDB.updateDb();
        return "redirect:../";
    }

    @RequestMapping(value = "/average")
    public String average(Model model) {
        model.addAttribute("averagedata", new Averagedata());
        return "average";
    }

    @RequestMapping(value = "/average/submit", method = RequestMethod.POST)
    public String average(@ModelAttribute Averagedata averagedata, Model model) {
        if (!(averagedata.getOt().equals("") & averagedata.getPo().equals(""))) {
            System.out.println("true");
            System.out.println(averagedata);
            String massage = null;
            massage = maina.getAvarage(averagedata);
            model.addAttribute("massage", massage);
        }
//        if((averagedata.getOt().equals("")&averagedata.getPo().equals(""))||(!averagedata.getOt().equals("")&!averagedata.getPo().equals(""))){
//            System.out.println("true");
//        }


//        if(averagedata.getOt().equals(""))
//            System.out.println("pusto");
//        System.out.println(averagedata.getUrl()+"\r\n"+averagedata.getOt()+"\r\n"+ averagedata.getPo());
        else {
            model.addAttribute("massage", "Заполните поля");
            return "average";
        }
        return "average";
    }


    @RequestMapping(value = "/equalsAcc")
    public String equalsAcc(Model model) {
        model.addAttribute("twoAcc", new TwoAcc());
        return "equalsAcc";
    }

    //"https://www.instagram.com/m_a_r_t_a.m/"
    @RequestMapping(value = "/equalsAcc/submit", method = RequestMethod.POST)
    public String equalsAcc(@ModelAttribute TwoAcc twoAcc, Model model) {
        String massage = null;
        if (!(twoAcc.getFirst().equals("") || twoAcc.getSecond().equals(""))) {
            try {
                maina.start();
                massage = maina.testFollowers(twoAcc.getFirst(), twoAcc.getSecond());
            } catch (Exception e) {
                e.printStackTrace();
            }
            model.addAttribute("massage", massage);
            return "equalsAcc";
        }
        model.addAttribute("massage", "Заполните поля");
        return "equalsAcc";
    }
}
