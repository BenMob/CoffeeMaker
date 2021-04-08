package com.CoffeeMaker;

import com.CoffeeMaker.Coffee.CoffeeTypes;
import com.CoffeeMaker.Condiment.CondimentIF;

import java.io.IOException;
import java.util.List;

public class CoffeeMachine {

    CoffeeOS coffeeOS;
    public CoffeeMachine(){
        this.coffeeOS = new CoffeeOS();
    }

    public void order(CoffeeTypes type, List<CondimentIF> condimentIFList) throws IOException {
        switch (type){
            case REGULAR -> coffeeOS.makeCoffee(1, condimentIFList);
            case MOCHA -> coffeeOS.makeCoffee(2, condimentIFList);
            case LATTE -> coffeeOS.makeCoffee(3, condimentIFList);
            case ESPRESSO -> coffeeOS.makeCoffee(4, condimentIFList);
            case CAPPUCCINO -> coffeeOS.makeCoffee(5, condimentIFList);
            default -> System.out.println("We do not serve this here. Sorry!");
        }
    }
}
