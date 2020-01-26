package com.bo.mibu.java;

public class DecoyDuck extends Duck {

  @Override
  public void quack() {
    // override to do nothing
  }

  public void display() {
    System.out.println("Displaying Mallard Duck");
  }

  @Override
  public void fly() {
    // override to do nothing
  }
}
