package com.yz.model;

import java.util.Date;

public class Article {
    private Integer articleid;

    private String title;

    private Date emittime;

    private Date lastupdatetime;

    private String articletypename;

    private Integer userid;

    private Integer articletypeid;

    private String content;

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getEmittime() {
        return emittime;
    }

    public void setEmittime(Date emittime) {
        this.emittime = emittime;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public String getArticletypename() {
        return articletypename;
    }

    public void setArticletypename(String articletypename) {
        this.articletypename = articletypename == null ? null : articletypename.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getArticletypeid() {
        return articletypeid;
    }

    public void setArticletypeid(Integer articletypeid) {
        this.articletypeid = articletypeid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}