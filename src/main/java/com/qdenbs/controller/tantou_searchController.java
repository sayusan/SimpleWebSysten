package com.qdenbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class tantou_searchController {
    @RequestMapping(value = "/tantou_search", method = RequestMethod.GET)
    public String helloWorld(Model model) {
        return "tantou_search";
    }
}