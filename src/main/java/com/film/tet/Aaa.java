package com.film.tet;

public class Aaa {
    int a=0;
    public synchronized void number() throws InterruptedException {
        for (int i = 1; i < 52; i++) {
            if(i==1){
                a++;
            }
            System.out.println(i);
            i++;
            System.out.println(i);
            this.notify();
            this.wait();
        }
    }
    public synchronized void letter() throws InterruptedException {
        if(a==0){
            this.notify();
            this.wait();
        }
        for (int i = 0; i < 26; i++) {
            System.out.println((char) (65 + i));
            this.notify();
            this.wait();
        }
    }
}
