package com.qdenbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qdenbs.bean.TicketBean;
import com.qdenbs.db.table.entity.TicketEntity;
import com.qdenbs.service.SearchService;

@Controller
public class SearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping(value="/search") // どこから
    public String result(@ModelAttribute TicketBean ticketBean, Model model){
        List<TicketEntity> ticketList = null;
        // 初期値は全件表示
        ticketList = searchService.selectAll();

        model.addAttribute("ticket", ticketBean);
        System.out.println("ticketBean.title = " + ticketBean.getTitle());
        // チケットを題名で検索
        // ticketがnullの場合エラーになる
        if(ticketBean.getTitle() != null) {
            ticketList = searchService.selectTitle(ticketBean.getTitle());
        }

        // 作成日（登録日時）で検索
        // 未実装

        model.addAttribute("list",ticketList);
        return "search"; // 最終的な表示html
    }




}
