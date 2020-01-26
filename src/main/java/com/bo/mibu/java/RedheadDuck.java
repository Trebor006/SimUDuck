package com.bo.mibu.java;

public class RedheadDuck extends Duck implements Flyable, Quackable {

  public void display() {
    System.out.println("Displaying Redhead Duck");
  }

  public void fly() {
    System.out.println("Fly..");
  }

  public void quack() {
    System.out.println("Quack..");
  }
}
