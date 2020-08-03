package com.film.pojo;

import java.math.BigDecimal;

public class Screen {
    private Long sid;

    private Long cid;

    private Long mid;

    private Long viid;

    private String stime;

    private String etime;

    private BigDecimal sprice;

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

    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime;
    }

    public String getEtime() {
        return etime;
    }

    public void setEtime(String etime) {
        this.etime = etime;
    }

    public BigDecimal getSprice() {
        return sprice;
    }

    public void setSprice(BigDecimal sprice) {
        this.sprice = sprice;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "sid=" + sid +
                ", cid=" + cid +
                ", mid=" + mid +
                ", viid=" + viid +
                ", stime='" + stime + '\'' +
                ", etime='" + etime + '\'' +
                ", sprice=" + sprice +
                '}';
    }
}