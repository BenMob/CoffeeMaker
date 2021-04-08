package com.CoffeeMaker.Coffee;

import com.CoffeeMaker.Condiment.Cream;
import com.CoffeeMaker.Condiment.Vanilla;

public class CoffeeEspresso extends AbstractCoffee {
    private final double price = 4;

    @Override
    public double getCoffeePrice() {
        return price;
    }

    @Override
    public void start() {
        System.out.println();
        this.environment.setPowerLED(0)
                .setCoffeeType("Espresso")
                .setGrindingTime(8)
                .setTemperature(100)
                .addCondiment(new Cream())
                .addCondiment(new Vanilla())
                .holdTemperature(2)
                .wait(15)
                .setPowerLED(1)
                .computePrice(this)
                .done();
        System.out.println("=============================================");
    }
}
