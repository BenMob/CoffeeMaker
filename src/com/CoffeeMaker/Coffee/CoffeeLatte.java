package com.CoffeeMaker.Coffee;

import com.CoffeeMaker.Condiment.CondimentIF;

import java.util.List;

public class CoffeeLatte extends AbstractCoffee{
    private final double price = 3;


    @Override
    public double getCoffeePrice() {
        return price;
    }

    @Override
    public void start() {
        System.out.println();
        this.environment.setPowerLED(0)
                .setCoffeeType("latte")
                .setGrindingTime(8)
                .setTemperature(150)
                .holdTemperature(2)
                .wait(15)
                .setPowerLED(1)
                .computePrice(this)
                .done();
        System.out.println("=============================================");
    }

}
