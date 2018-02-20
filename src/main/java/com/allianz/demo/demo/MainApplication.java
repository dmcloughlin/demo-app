package com.allianz.demo.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.applet.Main;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dmcloughlin on 20/02/2018.
 */
public class MainApplication {

    public static void main(String[] args) {

       CoffeeMachine gaggia = new Gaggia();
       CoffeeMachine victoria = new Victoria();

       new Brewer().brew(gaggia);
    }
}
