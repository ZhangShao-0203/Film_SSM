package com.film.pojo;

public class MovieActor {
    private Long mid;

    private Long acid;

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "MovieActor{" +
                "mid=" + mid +
                ", acid=" + acid +
                '}';
    }

    public Long getAcid() {
        return acid;
    }

    public void setAcid(Long acid) {
        this.acid = acid;
    }
}