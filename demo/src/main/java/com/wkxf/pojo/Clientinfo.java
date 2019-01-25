package com.wkxf.pojo;

public class Clientinfo {
    private Integer id;

    private String cname;

    private String uid;

    private Byte status;

    private String camlist;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getCamlist() {
        return camlist;
    }

    public void setCamlist(String camlist) {
        this.camlist = camlist == null ? null : camlist.trim();
    }
}