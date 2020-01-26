package com.bo.mibu.java;

import com.bo.mibu.java.fly.FlyNoWay;
import com.bo.mibu.java.quack.Quack;

public class ModelDuck extends Duck {

  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I’m a model duck");
  }
}
