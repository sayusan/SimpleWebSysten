package com.qdenbs.bean;

public class SyainBean {

    private String id;
    private String pass;
    private String shimei;
    private String regist_dt;	// 登録日時
    private String update_dt;	// 更新日時
    /**
     * @return id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id セットする id
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return pass
     */
    public String getPass() {
        return pass;
    }
    /**
     * @param pass セットする pass
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
    /**
     * @return shimei
     */
    public String getShimei() {
        return shimei;
    }
    /**
     * @param shimei セットする shimei
     */
    public void setShimei(String name) {
        this.shimei = name;
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
