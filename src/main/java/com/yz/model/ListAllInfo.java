package com.yz.model;

import java.util.Date;

public class ListAllInfo {
    private String articleTypeName;
    private String articleTypeDesc;
    private String userName;
    private Date registerTime;
    private Integer countall;

    public String getArticleTypeName() {
        return articleTypeName;
    }

    public void setArticleTypeName(String articleTypeName) {
        this.articleTypeName = articleTypeName;
    }

    public String getArticleTypeDesc() {
        return articleTypeDesc;
    }

    public void setArticleTypeDesc(String articleTypeDesc) {
        this.articleTypeDesc = articleTypeDesc;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Integer getCountall() {
        return countall;
    }

    public void setCountall(Integer countall) {
        this.countall = countall;
    }
}
