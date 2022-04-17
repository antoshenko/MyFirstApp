package com.my.first.app.chapter1;

public class p44_BeerSong {

    public static void main(String[] args) {
        int beerNum = 99;
        String word;
        int x = 0;

        while (beerNum > 0) {
            if (beerNum > 20) {
                x = beerNum % 10;
            } else {
                x = beerNum;
            }

            if (x >= 2 & x <= 4) {
                word = "бутылки";
            } else if (x == 1) {
                word = "бутылка";
            } else {
                word = "бутылок";
            }

            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            if (beerNum == 0) {
                System.out.println("Нет бутылок пива на стене");
            }
        }
    }

}
