package com.CoffeeMaker.Coffee;

import com.CoffeeMaker.CoffeeOSAPI;
import com.CoffeeMaker.Condiment.CondimentIF;

import java.util.ArrayList;
import java.util.List;

public class AbstractCoffee implements CoffeeIF{
    protected CoffeeOSAPI environment;
    protected List<CondimentIF> condiments;

    @Override
    public void setEnvironment(CoffeeOSAPI env){
        this.environment = env;
        this.condiments = new ArrayList<>();
    }

    @Override
    public void start(){}

    @Override
    public void addCondiment(CondimentIF condiment, boolean isAddOn) {
        if(isAddOn){
            System.out.println("Adding extra " + condiment.getType());
            this.condiments.add(condiment);
        }
    }

    @Override
    public double getCoffeePrice() { return 0;}

    @Override
    public List<CondimentIF> getCondiments() {
        return condiments;
    }

}
