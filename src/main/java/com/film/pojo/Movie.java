package com.film.pojo;

import java.util.List;

public class Movie {

    private Long mid;

    private String mnamec;

    private String mnamee;

    private String msort;

    private String mleng;

    private String uptime;

    private String details;

    private String photo;

    private List<MovieActor> actorList;


    public List<MovieActor> getActorList() {
        return actorList;
    }

    public void setActorList(List<MovieActor> actorList) {
        this.actorList = actorList;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public String getMnamec() {
        return mnamec;
    }

    public void setMnamec(String mnamec) {
        this.mnamec = mnamec;
    }

    public String getMnamee() {
        return mnamee;
    }

    public void setMnamee(String mnamee) {
        this.mnamee = mnamee;
    }

    public String getMsort() {
        return msort;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "mid=" + mid +
                ", mnamec='" + mnamec + '\'' +
                ", mnamee='" + mnamee + '\'' +
                ", msort='" + msort + '\'' +
                ", mleng='" + mleng + '\'' +
                ", uptime='" + uptime + '\'' +
                ", details='" + details + '\'' +
                ", photo='" + photo + '\'' +
                ", actorList=" + actorList +
                '}';
    }

    public void setMsort(String msort) {
        this.msort = msort;
    }

    public String getMleng() {
        return mleng;
    }

    public void setMleng(String mleng) {
        this.mleng = mleng;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}