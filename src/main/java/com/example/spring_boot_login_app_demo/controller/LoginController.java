package com.example.spring_boot_login_app_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("access-denied")
    public String accessDenided() {
        return "auth/accessDenial";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "auth/loginForm";
    }

    @GetMapping(value = "loginForm", params = "failure")
    public String loginFail(Model model) {
        model.addAttribute("failureMessage", "Wrong ID or Password");
        return "auth/loginForm";
    }
}
