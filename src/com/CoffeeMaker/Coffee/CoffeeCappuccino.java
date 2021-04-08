package com.CoffeeMaker.Coffee;

public class CoffeeCappuccino extends AbstractCoffee{
    private double price;
    public CoffeeCappuccino(){
        this.price = 5;
    }

    @Override
    public double getCoffeePrice() {
        return price;
    }

    @Override
    public void start() {
        System.out.println();
        this.environment.setPowerLED(0)
                .setCoffeeType("Cappuccino")
                .setGrindingTime(8)
                .setTemperature(150)
                .holdTemperature(2)
                .wait(15)
                .setPowerLED(1)
                .done();
        System.out.println("=============================================");
    }
}
