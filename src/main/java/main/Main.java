package main;

import com.bo.mibu.java.MallardDuck;
import com.bo.mibu.java.RedheadDuck;

public class Main {

  public static void main(String[] args) {

    MallardDuck mallardDuck = new MallardDuck();
    mallardDuck.quack();
    mallardDuck.swim();
    mallardDuck.display();

    RedheadDuck redheadDuck = new RedheadDuck();
    redheadDuck.quack();
    redheadDuck.swim();
    redheadDuck.display();
  }
}
