package com.website.survey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showHomePage(Model model) {
        String welcomeMessage = "Welcome to our website!";
        model.addAttribute("welcomeMessage", welcomeMessage);
        return "home";
}
}
