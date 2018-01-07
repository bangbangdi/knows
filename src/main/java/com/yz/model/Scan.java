package com.yz.model;

import java.util.Date;

public class Scan {
    private Integer scanid;

    private Date scantime;

    private Integer articleid;

    public Integer getScanid() {
        return scanid;
    }

    public void setScanid(Integer scanid) {
        this.scanid = scanid;
    }

    public Date getScantime() {
        return scantime;
    }

    public void setScantime(Date scantime) {
        this.scantime = scantime;
    }

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }
}