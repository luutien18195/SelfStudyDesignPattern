package com.behavior.strategy.duck_example;

public class FlyNoWay implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Can't fly");
    }
}
