package com.qdenbs.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.qdenbs.bean.TicketBean;
import com.qdenbs.db.table.entity.TicketEntity;
import com.qdenbs.service.ShokaiService;

@Controller
public class hensyuController {

    @Autowired
    private ShokaiService shokaiService;

    /*
     * 選択したチケットを表示
     */
//    @RequestMapping(value = "/hensyu", method = RequestMethod.GET)
//    public String hensyu(@RequestParam("id") String id, @ModelAttribute TicketBean ticketBean, Model model) {
//        List<TicketEntity> ticketList = null;
//        // ticketIDでチケットを検索
//        BigDecimal ticketId = new BigDecimal(id);
//        ticketList = shokaiService.selectTicketId(ticketId);
//        model.addAttribute("ticket",ticketList.get(0));
//
//        return "hensyu";
//    }


    /*
     * 選択したチケットを表示
     */
    @RequestMapping(value = "/hensyu")
    public String hensyu(@RequestParam("id") String id,@ModelAttribute TicketBean ticketBean, Model model) {
        List<TicketEntity> ticketList = null;
        // ticketIDでチケットを検索
        BigDecimal ticketId = new BigDecimal(id);
        ticketList = shokaiService.selectTicketId(ticketId);
        model.addAttribute("ticket",ticketList.get(0));

        return "hensyu";
    }
}