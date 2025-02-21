package com.controller;

import com.dao.UserDao;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Random;

@Controller
@RequestMapping("/loginotp")
public class LoginController {

    private int generatedOTP;
    @Autowired
    private UserDao userDao; // Inject userDao to fetch Details

    @PostMapping("/generate")
    public String generateOTP(@RequestParam("mobile") String mobile, HttpSession session, Model m) {

        // Validate mobile number: Exactly 10 digits, only numbers
        if (!mobile.matches("\\d{10}")) {
            System.out.println("Invalid mobile number: " + mobile);
            m.addAttribute("error", "Invalid mobile number! Please enter a 10-digit number.");
            return "login"; // Redirect back to Login page
        }

        // Generate OTP only for valid mobile numbers
         generatedOTP = new Random().nextInt(900000) + 100000; // 6-digit OTP
        session.setAttribute("otp", generatedOTP); // Store OTP in session
        session.setAttribute("mobile", mobile); // Store mobile number

        System.out.println("Mobile no. " + mobile);
        System.out.println("Generated OTP: " + generatedOTP); // Debugging

        return "loginotp"; // Redirect to OTP page

    }

    @PostMapping("/verifyotp")
    public String verifyOtp(@RequestParam("otp") int enteredOtp, Model m, HttpSession session ){

        String mobile = (String) session.getAttribute("mobile");

        session.getAttribute("otp");
        if (enteredOtp == generatedOTP){
            User user = userDao.getUserByMobile(mobile);

            if (user != null){
                m.addAttribute("user", user);
                return "dashboard";
            } else {
                m.addAttribute("error", "User Not Found . Please Register ");
                return "loginotp";
            }

        }else {
            m.addAttribute("error", "Invalid OTP.. Try Again! ");
            return "loginotp";
        }
    }




}
