package myprogect.insta.service;


import myprogect.insta.entity.Infoacc;
import myprogect.insta.model.Averagedata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UpdateDB {
    @Autowired
    InfoAccService infoAccService;

    Averagedata averagedata = new Averagedata();
    Infoacc infoacc = new Infoacc();

    public void updateDb(){
        DateFormat TIMESTAMP = new SimpleDateFormat("dd.MM.yyyy");
        String ot  = TIMESTAMP.format(new Date().getTime()-86400000);
        String po  = TIMESTAMP.format(new Date().getTime()-950400000);
        List<Infoacc> list = new ArrayList<>();
        list = infoAccService.getAll();
//        list.addAll(infoAccService.getAll());
        for (Infoacc acc: list) {
            System.out.println(acc);
            averagedata = new Averagedata(acc.getUsername(), ot, po);
            Anonymus anonymus = new Anonymus();
            String check = anonymus.checkUser(averagedata);
            if(check.equals("Аккаунт открыт")){
                acc = anonymus.selectionPosts(averagedata, acc);
                infoAccService.update(acc);
            }
            try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
//public void updateDb(){
//    DateFormat TIMESTAMP = new SimpleDateFormat("dd.MM.yyyy");
//    String ot  = TIMESTAMP.format(new Date().getTime()-86400000);
//    String po  = TIMESTAMP.format(new Date().getTime()-950400000);
//    List<String> list = new ArrayList<>();
//    list.add("natellanatella");
//
//
//    for (String acc: list) {
//        System.out.println(acc);
//        averagedata = new Averagedata(acc, ot, po);
//        Anonymus anonymus = new Anonymus();
//        String check = anonymus.checkUser(averagedata);
//        Infoacc infoacc1 = new Infoacc();
//
//        if(check.equals("Аккаунт открыт")){
//            infoacc = anonymus.selectionPosts(averagedata, infoacc1);
//            infoAccService.save(infoacc);
//        }
//        try {
//            Thread.sleep(30000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
}
