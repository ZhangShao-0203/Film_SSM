package com.film.tet;

import lombok.SneakyThrows;

public class numberThread implements Runnable {
    private Aaa a=new Aaa();

    public numberThread(Aaa a) {
        this.a = a;
    }

    @SneakyThrows
    @Override
    public void run() {
        a.number();
    }
}
