package com.allianz.demo.demo;

/**
 * Created by dmcloughlin on 20/02/2018.
 */
public class Victoria extends CoffeeMachine {

    @Override
    public String brew() {
       return "VICTORIA BREWING NOW";
    }

    @Override
    public int getWeight() {
        return 10;
    }

    @Override
    public int getHeight() {
        return 20;
    }
}
