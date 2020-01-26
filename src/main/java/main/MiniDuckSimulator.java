package main;

import com.bo.mibu.java.Duck;
import com.bo.mibu.java.MallardDuck;
import com.bo.mibu.java.ModelDuck;
import com.bo.mibu.java.fly.FlyRocketPowered;

public class MiniDuckSimulator {

  public static void main(String[] args) {
    Duck mallardDuck = new MallardDuck();
    mallardDuck.performQuack();
    mallardDuck.performFly();


    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();

  }
}
