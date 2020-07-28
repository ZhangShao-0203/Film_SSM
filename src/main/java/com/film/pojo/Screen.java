package com.film.pojo;

import java.util.Date;

public class Screen {
    private Long sid;

    private Long cid;

    private Long mid;

    private Long viid;

    private Date stime;

    private Object sprice;

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public Long getViid() {
        return viid;
    }

    public void setViid(Long viid) {
        this.viid = viid;
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public Object getSprice() {
        return sprice;
    }

    public void setSprice(Object sprice) {
        this.sprice = sprice;
    }
}