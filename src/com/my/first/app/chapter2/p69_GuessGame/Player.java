package com.my.first.app.chapter2.p69_GuessGame;

public class Player {
  int number = 0;

  public void guess() {
    number = (int) (Math.random() * 10);
    System.out.println("I think it's a number " + number);
  }

}