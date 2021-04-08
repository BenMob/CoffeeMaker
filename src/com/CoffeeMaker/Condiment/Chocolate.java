package com.CoffeeMaker.Condiment;

public class Chocolate implements CondimentIF{

    public Chocolate(){}
    @Override
    public double getChargeFor(int servings) {
        return 1 * servings;
    }

    @Override
    public String getType() {
        return "Chocolate";
    }
}
