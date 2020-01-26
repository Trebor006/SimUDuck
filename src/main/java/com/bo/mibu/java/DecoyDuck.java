package com.bo.mibu.java;

import com.bo.mibu.java.fly.FlyNoWay;
import com.bo.mibu.java.quack.MuteQuack;

public class DecoyDuck extends Duck {

  public DecoyDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new MuteQuack();
  }

  @Override
  public void display() {
    System.out.println("Displaying DecoyDuck Duck");
  }
}
