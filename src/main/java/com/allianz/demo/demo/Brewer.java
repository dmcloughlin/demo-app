package com.allianz.demo.demo;

/**
 * Created by dmcloughlin on 20/02/2018.
 */
public class Brewer {

    public void brew(CoffeeMachine coffeeMachine) {

       System.out.println("COFFEE MACHINE");

       System.out.println(coffeeMachine.brew());
       System.out.println(coffeeMachine.getHeight());
       System.out.println(coffeeMachine.getWeight());
    }
}
