package com.qdenbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {
    @RequestMapping(value = "/main")
    public String helloWorld(Model model) {
        return "main";
    }
}