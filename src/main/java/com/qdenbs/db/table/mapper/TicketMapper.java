package com.qdenbs.db.table.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qdenbs.db.table.entity.TicketEntity;
import com.qdenbs.db.table.entity.TicketExample;
import com.qdenbs.db.table.entity.TicketKey;

public interface TicketMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.ticket
     *
     * @mbg.generated
     */
    long countByExample(TicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.ticket
     *
     * @mbg.generated
     */
    int deleteByExample(TicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.ticket
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(TicketKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.ticket
     *
     * @mbg.generated
     */
    int insert(TicketEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.ticket
     *
     * @mbg.generated
     */
    int insertSelective(TicketEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.ticket
     *
     * @mbg.generated
     */
    List<TicketEntity> selectByExample(TicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.ticket
     *
     * @mbg.generated
     */
    TicketEntity selectByPrimaryKey(TicketKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.ticket
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TicketEntity record, @Param("example") TicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.ticket
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TicketEntity record, @Param("example") TicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.ticket
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TicketEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.ticket
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TicketEntity record);

    /**
     * Ticketテーブルへ新規登録
     * (自動採番されたIDを取得)
     * @param user
     */
    void insertSelective_id(TicketEntity record);

    /**
     * Ticketテーブルへ新規登録②
     * (自動採番されたIDを取得)
     * @param user
     */
    void insertTicket_(TicketEntity record);

}
