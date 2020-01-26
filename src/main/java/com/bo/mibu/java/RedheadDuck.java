package com.bo.mibu.java;

import com.bo.mibu.java.fly.FlyWithWings;
import com.bo.mibu.java.quack.Quack;

public class RedheadDuck extends Duck {

  public RedheadDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  public void display() {
    System.out.println("Displaying Redhead Duck");
  }
}
