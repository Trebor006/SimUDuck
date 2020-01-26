package com.bo.mibu.java;

import com.bo.mibu.java.fly.FlyWithWings;
import com.bo.mibu.java.quack.Quack;

public class MallardDuck extends Duck {

  public MallardDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("Displaying Mallard Duck");
  }
}
