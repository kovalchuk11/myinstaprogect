package myprogect.insta.controller;

import myprogect.insta.Main;
import myprogect.insta.model.TwoAcc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class MyController {

    @Autowired
    private Main main;

    @RequestMapping
    public String showIndex(){
        return "index";
    }

    @RequestMapping(value = "/equalsAcc")
    public String equalsAcc(Model model){
        model.addAttribute("twoAcc", new TwoAcc());
        return "equalsAcc";
    }
//"https://www.instagram.com/m_a_r_t_a.m/"
    @RequestMapping(value = "/equalsAcc/submit", method = RequestMethod.POST)
    public String equalsAcc(@ModelAttribute TwoAcc twoAcc, Model model){
        String massage = null;
        try {
            main.start();
            massage = main.testFollowers(twoAcc.getFirst(), twoAcc.getSecond());
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("massage", massage);
        return "equalsAcc";
    }

}
