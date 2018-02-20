package com.allianz.demo.demo;

/**
 * Created by dmcloughlin on 20/02/2018.
 */
public class Gaggia extends CoffeeMachine {

    @Override
    public String brew() {
        return "GAGGIA BREWING NOW...";
    }

    @Override
    public int getWeight() {
        return 1000;
    }

    @Override
    public int getHeight() {
        return 2000;
    }
}