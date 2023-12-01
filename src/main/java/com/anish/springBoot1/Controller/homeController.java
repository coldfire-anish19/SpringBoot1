package com.anish.springBoot1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @RequestMapping(value={"","/","/home"})
    public String sendHomeView(){
       // model.addAttribute("username","Anish");
        return "home.html";
    }

}
