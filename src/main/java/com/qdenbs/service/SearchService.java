package com.qdenbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qdenbs.db.table.entity.TicketEntity;
import com.qdenbs.db.table.entity.TicketExample;
import com.qdenbs.db.table.mapper.TicketMapper;

/**
 * チケット検索 Service
 * @author 33448
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SearchService {

    @Autowired
    private TicketMapper ticketMapper;


    /*
     * 題名でチケットを検索
     */
    public List<TicketEntity> selectTitle(String title){
        // TODO:部分一致で検索したい
        TicketExample example = new TicketExample();
        example.createCriteria().andTitleEqualTo(title);
        return ticketMapper.selectByExample(example);
    }

    /*
     * チケット全件検索（表示）
     */
    public List<TicketEntity> selectAll(){
        TicketExample example = new TicketExample();
        return ticketMapper.selectByExample(example);
    }
}
