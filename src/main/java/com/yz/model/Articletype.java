package com.yz.model;

public class Articletype {
    private Integer articletypeid;

    private String articletypename;

    private String articletypedesc;

    public Integer getArticletypeid() {
        return articletypeid;
    }

    public void setArticletypeid(Integer articletypeid) {
        this.articletypeid = articletypeid;
    }

    public String getArticletypename() {
        return articletypename;
    }

    public void setArticletypename(String articletypename) {
        this.articletypename = articletypename == null ? null : articletypename.trim();
    }

    public String getArticletypedesc() {
        return articletypedesc;
    }

    public void setArticletypedesc(String articletypedesc) {
        this.articletypedesc = articletypedesc == null ? null : articletypedesc.trim();
    }
}