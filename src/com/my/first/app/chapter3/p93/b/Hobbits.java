package com.my.first.app.chapter3.p93.b;

public class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = 0;

        while (z < 3) {
            h[z] = new Hobbits();
            if (z == 0) {
                h[z].name = "Bilbo";
            }
            if (z == 1) {
                h[z].name = "Frodo";
            }
            if (z == 2) {
                h[z].name = "Sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
            z = z + 1;
        }
    }

}
