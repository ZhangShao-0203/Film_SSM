package com.film.pojo;

public class Video {
    private Long viid;

    private String viname;

    private Long cid;
    private Cinema cinema;

    public Long getViid() {
        return viid;
    }

    public void setViid(Long viid) {
        this.viid = viid;
    }

    public String getViname() {
        return viname;
    }

    public void setViname(String viname) {
        this.viname = viname;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }
}