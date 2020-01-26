package com.bo.mibu.java;

import com.bo.mibu.java.fly.FlyNoWay;
import com.bo.mibu.java.quack.Squeak;

public class RubberDuck extends Duck {

  public RubberDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Squeak();
  }

  public void display() {
    System.out.println("Displaying Rubber Duck");
  }
}
