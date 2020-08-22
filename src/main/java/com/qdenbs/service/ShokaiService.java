package com.qdenbs.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qdenbs.bean.TicketBean;
import com.qdenbs.db.table.entity.TicketEntity;
import com.qdenbs.db.table.entity.TicketExample;
import com.qdenbs.db.table.mapper.TicketMapper;

/**
 * チケット照会 Service
 * @author 33448
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ShokaiService {

    @Autowired
    private TicketMapper ticketMapper;


    /*
     * 題名でチケットを検索
     */
    public List<TicketEntity> selectTicketId(BigDecimal ticketNumber){
        TicketExample example = new TicketExample();
        example.createCriteria().andTicketNumberEqualTo(ticketNumber);
        return ticketMapper.selectByExample(example);
    }

    /**
     * チケット削除
     */
    public int Delete(BigDecimal ticketNumber) {
        TicketExample example = new TicketExample();
        example.createCriteria().andTicketNumberEqualTo(ticketNumber);
        return ticketMapper.deleteByExample(example);
    }


    /**
     * チケット更新
     */
    public void Update(BigDecimal ticketNumber, TicketBean ticketBean) {

        Date date = new Date();

        try {
            TicketEntity ticketEntity = new TicketEntity();

            // チケットNo（PK）
            ticketEntity.setTicketNumber(ticketNumber);
            ticketEntity.setStatus(ticketBean.getStatus());
            ticketEntity.setTitle(ticketBean.getTitle());
            ticketEntity.setText(ticketBean.getText());
            ticketEntity.setTanto(ticketBean.getTanto());
            ticketEntity.setKosu(ticketBean.getKosu());
            ticketEntity.setUpdateDt(date);

            int result = ticketMapper.updateByPrimaryKeySelective(ticketEntity);
            System.out.println(result);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
