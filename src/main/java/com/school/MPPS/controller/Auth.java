package com.school.MPPS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Auth {
	
	@RequestMapping("/login")
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/logout")
    public String logoutPage() {
        return "logout";
    }
    @RequestMapping("/logout-success")
    public String logoutsuccussPage() {
        return "logout-success";
    }
}
