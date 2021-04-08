package com.CoffeeMaker.Coffee;

import com.CoffeeMaker.CoffeeOSAPI;
import com.CoffeeMaker.Condiment.CondimentIF;

import java.util.List;

public interface CoffeeIF {
    void setEnvironment(CoffeeOSAPI env);
    void start();
    void addCondiment(CondimentIF condiment);
    double getCoffeePrice();
    List<CondimentIF> getCondiments();
}
