package com.CoffeeMaker;

import com.CoffeeMaker.Coffee.CoffeeTypes;
import com.CoffeeMaker.Condiment.Chocolate;
import com.CoffeeMaker.Condiment.CondimentIF;
import com.CoffeeMaker.Condiment.Cream;

import java.util.List;
import java.util.ArrayList;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	  CoffeeMachine coffeeMachine = new CoffeeMachine();

	  List<CondimentIF> mochaCondiments = new ArrayList<>();
	  mochaCondiments.add(new Chocolate());

	  List<CondimentIF> espressoCondiments = new ArrayList<>();
	  espressoCondiments.add(new Chocolate());
	  espressoCondiments.add(new Chocolate());


	  coffeeMachine.order(CoffeeTypes.MOCHA, mochaCondiments);
	  coffeeMachine.order(CoffeeTypes.ESPRESSO, espressoCondiments);

    }
}
