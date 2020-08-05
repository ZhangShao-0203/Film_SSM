package com.film.pojo;

import java.util.List;

public class Actor {

    private Long acid;

    private String acname;

    private String acphoto;

    private String acsort;

    private int pages;

    private List<Movie> movieList;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public Long getAcid() {
        return acid;
    }

    public void setAcid(Long acid) {
        this.acid = acid;
    }

    public String getAcname() {
        return acname;
    }

    public void setAcname(String acname) {
        this.acname = acname;
    }

    public String getAcphoto() {
        return acphoto;
    }

    public void setAcphoto(String acphoto) {
        this.acphoto = acphoto;
    }

    public String getAcsort() {
        return acsort;
    }

    public void setAcsort(String acsort) {
        this.acsort = acsort;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "acid=" + acid +
                ", acname='" + acname + '\'' +
                ", acphoto='" + acphoto + '\'' +
                ", acsort='" + acsort + '\'' +
                '}';
    }
}