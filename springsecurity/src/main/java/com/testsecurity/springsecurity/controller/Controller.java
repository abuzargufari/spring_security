package com.testsecurity.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {
    

    @GetMapping("/user")
    public ModelAndView user() {
        return new ModelAndView("user.html");
    }

    @GetMapping("/admin")
    public ModelAndView admin() {
        return new ModelAndView("admin.html");
    }
}
