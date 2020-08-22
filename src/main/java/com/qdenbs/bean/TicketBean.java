package com.qdenbs.bean;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class TicketBean {

    /*
     * チケットID
     */
    private String id;

    /*
     *  ステータス
     */
    private String status;

    /*
     *  題名
     */
    @NotEmpty(message = "題名を入力してください")
    private String title;

    /*
     *  説明
     */
    @NotEmpty(message = "説明を入力してください")
    private String text;

    /*
     *  担当者名
     */
//    @NotEmpty(message = "担当者名を入力してください")
    private String tanto;
    /*
     *  工数
     */
    @NotEmpty(message = "工数を入力してください")
    @Size(max = 3)
    private String kosu;
    /*
     *  登録日時
     */
    private String regist_dt;
    /*
     *  更新日時
     */
    private String update_dt;


    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id セットする tanto
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status セットする tanto
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title セットする tanto
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return test
     */
    public String getText() {
        return text;
    }

    /**
     * @param text セットする tanto
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return tanto
     */
    public String getTanto() {
        return tanto;
    }

    /**
     * @param tanto セットする tanto
     */
    public void setTanto(String tanto) {
        this.tanto = tanto;
    }

    /**
     * @return kosu
     */
    public String getKosu() {
        return kosu;
    }

    /**
     * @param kosu セットする kosu
     */
    public void setKosu(String kosu) {
        this.kosu = kosu;
    }

    /**
     * @return regist_dt
     */
    public String getRegist_dt() {
        return regist_dt;
    }

    /**
     * @param regist_dt セットする regist_dt
     */
    public void setRegist_dt(String regist_dt) {
        this.regist_dt = regist_dt;
    }

    /**
     * @return update_dt
     */
    public String getUpdate_dt() {
        return update_dt;
    }

    /**
     * @param update_dt セットする update_dt
     */
    public void setUpdate_dt(String update_dt) {
        this.update_dt = update_dt;
    }
}
