package com.medtracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SignupController {
    @GetMapping("/signup/patient")
    public String patientSignup() {
        return "signup-patient";
    }


    @GetMapping("/signup/{role}")
    public String signupByRole(@PathVariable String role) {

        if (role.equals("patient")) {
            return "signup-patient";
        }
        else if (role.equals("doctor")) {
            return "signup-doctor";
        }
        else if (role.equals("caretaker")) {
            return "signup-caretaker";
        }

        return "redirect:/";
    }
}
