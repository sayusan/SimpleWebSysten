package com.qdenbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.qdenbs.bean.TicketBean;
import com.qdenbs.db.table.entity.SyainEntity;
import com.qdenbs.service.TourokuService;

@Controller
public class tourokuController {

    @Autowired
    private TourokuService tourokuService;

    @RequestMapping(value = "/touroku")
    public String touroku(@ModelAttribute TicketBean ticketBean, Model model) {

        // 社員選択リスト表示
        List<SyainEntity> syainList = tourokuService.selectSyain();
        model.addAttribute("tanto",syainList);

        return "touroku";
    }


    // 実際にDB登録と初期表示でメソッド分けたい

    @RequestMapping(value = "/shinki", method = RequestMethod.POST)
    public String Touroku_new (@Validated @ModelAttribute TicketBean ticket,
            BindingResult bindingResult, Model model,
            @RequestParam("file") MultipartFile file)
    {
        // 社員選択リスト表示
        List<SyainEntity> syainList = tourokuService.selectSyain();
        model.addAttribute("tanto",syainList);

        // チケット登録
        model.addAttribute("ticket", ticket);

        // 添付ファイル
        // アップロードファイルが存在する場合はfileテーブルへの登録とファイル保存を行う
//        if(!file.isEmpty()) {
//            tourokuService.registFile(file, ticket);
//        }

        if (bindingResult.hasErrors()) {
            return "touroku";
          }

        // DB登録
        int id = 0;
        id = tourokuService.registTicket(ticket);

        if(id == 0) {
            System.out.println("INSERT FALSE...");
            // TODO:システムエラー的な
        }

        return "redirect:/shokai?id=" + id;
    }
}