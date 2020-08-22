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
public class shokaiController {

    @Autowired
    private ShokaiService shokaiService;
    private BigDecimal ticketId;


    /**
     * 選択したチケットを表示
     */
    @RequestMapping(value = "/shokai")
    public String shokai(@RequestParam("id") String id, Model model) {
        List<TicketEntity> ticketList = null;
        // ticketIDでチケットを検索
        ticketId = new BigDecimal(id);
        ticketList = shokaiService.selectTicketId(ticketId);
        model.addAttribute("ticket",ticketList.get(0));

        return "shokai";
    }


    /**
     * 削除処理
     */
    @RequestMapping(value = "/delete")
    public String deleteTicket(@ModelAttribute TicketBean ticketBean, Model model) {
        ticketId = new BigDecimal(ticketBean.getId());
        int result =  shokaiService.Delete(ticketId);
        if(result == 1) {
            System.out.println("Delete Complete!");
        }else if(result == 2) {
            System.out.println("※削除処理はコメントアウト中※");
        }
        else {
            System.out.println("Delete Failed...");
        }
      return "redirect:/search"; // redirect 別のコントローラーを呼ぶ
    }


    /**
     * 更新処理
     * ★削除もこっちのやりかたのほうが○
     */
    @RequestMapping(path = "/shokai", params = "updateFlag=1")
    public String updateTicket(@RequestParam("ticketNumber") String ticketNumber, @ModelAttribute TicketBean ticketBean, Model model) {
        // TODO: BeanがチケットNo以外空っぽ

        model.addAttribute("ticket", ticketBean);
        ticketId = new BigDecimal(ticketNumber);

        // 更新処理
        shokaiService.Update(ticketId, ticketBean);

        return "redirect:/shokai?id=" + ticketNumber; // redirect 別のコントローラーを呼ぶ
    }
}