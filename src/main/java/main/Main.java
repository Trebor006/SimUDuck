package main;

import com.bo.mibu.java.Duck;
import com.bo.mibu.java.MallardDuck;

public class Main {

  public static void main(String[] args) {

    Duck mallardDuck = new MallardDuck();
    mallardDuck.performQuack();
    mallardDuck.performFly();
  }
}
