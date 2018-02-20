package com.allianz.demo.demo;

/**
 * Created by dmcloughlin on 20/02/2018.
 */

public abstract class CoffeeMachine {

    private int height;
    private int weight;

    public abstract String brew();

    public abstract int getWeight();

    public abstract int getHeight();
}
