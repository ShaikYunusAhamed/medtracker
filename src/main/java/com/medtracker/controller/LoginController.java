package com.medtracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    // existing login page if any
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    // NEW: role-based login pages
    @GetMapping("/login/patient")
    public String patientLogin() {
        return "login-patient";
    }

    @GetMapping("/login/doctor")
    public String doctorLogin() {
        return "login-doctor";
    }

    @GetMapping("/login/caretaker")
    public String caretakerLogin() {
        return "login-caretaker";
    }
}
