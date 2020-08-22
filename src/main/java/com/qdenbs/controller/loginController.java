package com.qdenbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qdenbs.bean.SyainBean;

@Controller
public class loginController {
    @RequestMapping(value = "/login")
    public String helloWorld(@ModelAttribute SyainBean syainBean, Model model) {
        model.addAttribute("syain", syainBean);
        System.out.print(syainBean.getId());
        System.out.print(syainBean.getPass());
        return "login";
    }
}