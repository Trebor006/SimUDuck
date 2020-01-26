package com.bo.mibu.java;

public abstract class Duck {

  public void quack() {
    System.out.println("Quack..");
  }

  public void swim() {
    System.out.println("Swim..");
  }

  public void fly() {
    System.out.println("Fly..");
  }

  public abstract void display();
}
