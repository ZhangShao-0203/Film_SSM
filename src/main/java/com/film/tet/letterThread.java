package com.film.tet;

import lombok.SneakyThrows;

public class letterThread implements Runnable  {
    private Aaa a=new Aaa();

    public letterThread(Aaa a) {
        this.a = a;
    }

    @SneakyThrows
    @Override
    public void run() {
        a.letter();
    }
}
