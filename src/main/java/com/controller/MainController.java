package com.controller;

import com.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

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
