package com.medtracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoleController {

    @GetMapping("/select-role/signup")
    public String signupRole() {
        return "role-signup";
    }

    @GetMapping("/select-role/login")
    public String loginRole() {
        return "role-login";
    }
}
