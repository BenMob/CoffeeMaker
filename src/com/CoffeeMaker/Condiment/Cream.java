package com.CoffeeMaker.Condiment;

public class Cream implements CondimentIF{

    public Cream(){}

    @Override
    public double getChargeFor(int servings) {
        return 0.25 * servings;
    }

    @Override
    public String getType() {
        return "Cream";
    }
}
