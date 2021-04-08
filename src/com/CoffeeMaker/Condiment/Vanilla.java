package com.CoffeeMaker.Condiment;

public class Vanilla implements CondimentIF{

    public Vanilla(){}

    @Override
    public double getChargeFor(int servings) {
        return 0.50 * servings;
    }

    @Override
    public String getType() {
        return "Vanilla";
    }
}
