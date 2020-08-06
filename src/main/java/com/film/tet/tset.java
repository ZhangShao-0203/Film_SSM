package com.film.tet;

public class tset {
    public static void main(String[] args) {
        Aaa aaa=new Aaa();
        letterThread letterThread=new letterThread(aaa);
        numberThread numberThread=new numberThread(aaa);
        Thread letter=new Thread(letterThread);
        Thread number=new Thread(numberThread);
       letter.start();
       number.start();
    }
}
