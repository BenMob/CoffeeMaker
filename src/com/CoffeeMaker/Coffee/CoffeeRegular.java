package com.CoffeeMaker.Coffee;

public class CoffeeRegular extends AbstractCoffee{
    private double price;
    public CoffeeRegular(){
        this.price = 1;
    }

    @Override
    public double getCoffeePrice() {
        return price;
    }

    @Override
    public void start() {
        System.out.println();
        this.environment.setPowerLED(0)
                .setCoffeeType("regular")
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