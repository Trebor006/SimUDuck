package com.bo.mibu.java;

public class RubberDuck extends Duck implements Quackable {

  public void quack() {
    System.out.println("overridden to Squeak");
  }

  public void display() {
    System.out.println("Displaying Rubber Duck");
  }
}
