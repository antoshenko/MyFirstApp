package com.my.first.app.chapter1;

public class p46_PhraseOMatic {

    public static void main(String[] args) {
        String[] wordListOne = {"круглосуточный", "взаимный", "проникающий", "умный", "динамичный"};
        String[] wordListTwo = {"трудный", "центральный", "фирменный", "сетевой", "общий", "совместный"};
        String[] wordListThree = {"процесс", "талант", "подход", "портал", "обзор", "образец"};

        int oneLength = wordListOne.length;
        System.out.println("oneLength = " + oneLength);
        int twoLength = wordListTwo.length;
        System.out.println("twoLength = " + twoLength);
        int threeLength = wordListThree.length;
        System.out.println("threeLength = " + threeLength);

        double r1 = Math.random();
        double r2 = Math.random();
        double r3 = Math.random();

        double rand1 = r1 * oneLength;
        System.out.println(r1 + " => rand1 = " + rand1 + " ; " + (int) rand1);

        double rand2 = r2 * twoLength;
        System.out.println(r2 + " => rand2 = " + rand2 + " ; " + (int) rand2);

        double rand3 = r3 * threeLength;
        System.out.println(r3 + " => rand3 = " + rand3 + " ; " + (int) rand3);

        String phrase = wordListOne[(int) rand1] + " " + wordListTwo[(int) rand2] + " " + wordListThree[(int) rand3];

        System.out.println("Все, что нам нужно, - это " + phrase);
    }

}
