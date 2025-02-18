package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String frontpage(){
        System.out.println("This is front page ");
        return "frontpage";
    }

    @RequestMapping("/signup")
    public String signup(){
        System.out.println("This is signup page ");
        return "signup";
    }


    @RequestMapping("/login")
    public String login(){
        System.out.println("This is login page ");
        return "login";
    }





}
