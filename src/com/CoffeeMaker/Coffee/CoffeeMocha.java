package com.CoffeeMaker.Coffee;

import com.CoffeeMaker.CoffeeOSAPI;
import com.CoffeeMaker.Condiment.Chocolate;
import com.CoffeeMaker.Condiment.CondimentIF;
import com.CoffeeMaker.Condiment.Cream;
import com.CoffeeMaker.Condiment.Vanilla;

import java.util.List;

public class CoffeeMocha extends AbstractCoffee{
    private final double price = 2;

    @Override
    public double getCoffeePrice() {
        return price;
    }


    @Override
    public void start() {
        System.out.println();
        this.environment.setPowerLED(0)
                .setCoffeeType("Mocha")
                .setGrindingTime(5)
                .setTemperature(200)
                .holdTemperature(5)
                .addCondiment(new Cream())
                .addCondiment(new Vanilla())
                .addCondiment(new Chocolate())
                .wait(15)
                .setPowerLED(1)
                .computePrice(this)
                .done();
        System.out.println("=============================================");
    }
}