package com.CoffeeMaker;

import com.CoffeeMaker.Coffee.AbstractCoffee;
import com.CoffeeMaker.Coffee.CoffeeIF;
import com.CoffeeMaker.Condiment.CondimentIF;
import java.util.ArrayList;
import java.util.List;

public class CoffeeOS implements CoffeeOSAPI{

    protected List<CoffeeIF> coffees;
    protected CoffeeIF currentCoffee;

    public CoffeeOS(){
        this.coffees = new ArrayList<>();
    }

    @Override
    public CoffeeOSAPI setCoffeeType(String str) {
        System.out.println("Coffee Type: " + str);
        return this;
    }

    @Override
    public CoffeeOSAPI setGrindingTime(int secs) {
        System.out.println("Grinding Time: " + secs + " seconds");
        return this;
    }

    @Override
    public CoffeeOSAPI addCondiment(CondimentIF condiment) {
        System.out.println("Adding " + condiment.getType());
        currentCoffee.addCondiment(condiment, true);

        /*
        if(/*isAddon){

        }else{

        }*/


        return this;
    }

    @Override
    public CoffeeOSAPI setTemperature(int degree) {
        System.out.println("Temperature: " + degree + " degrees");
        return this;
    }

    @Override
    public CoffeeOSAPI holdTemperature(int seconds) {
        System.out.println("Heat Time: " + seconds + " seconds");
        return this;
    }

    @Override
    public CoffeeOSAPI wait(int seconds){
        System.out.println("Wait Time: " + seconds + " seconds");
        return this;
    }

    @Override
    public CoffeeOSAPI setPowerLED(int num) {
        System.out.println("Power LED: " + num);
        return this;
    }

    @Override
    public CoffeeOSAPI setTypeLED(int num) {
        System.out.println("Type LED: " + num);
        return this;
    }

    /**
     *
     * @param coffee
     * @return
     */
    @Override
    public CoffeeOSAPI computePrice(CoffeeIF coffee) {
        System.out.println();
        System.out.println("RECEIPT");
        double balance = currentCoffee.getCoffeePrice();
        List<CondimentIF> condiments = currentCoffee.getCondiments();
        System.out.println("Coffee Price: $" + balance);

        for(CondimentIF condiment: condiments){
            double condimentPrice = condiment.getChargeFor(1);
            System.out.println(condiment.getType() + " Price: $" + condimentPrice);
            balance += condimentPrice;
        }
        System.out.println("Balance: $" + balance);
        return this;
    }

    @Override
    public CoffeeOSAPI done() {
        coffees.add(currentCoffee);
        currentCoffee = null;
        System.out.println("Thank you!");
        return this;
    }

    /**
     * 1 Regular
     * 2 Mocha
     * 3 Latte
     * 4 Espresso
     * 5 Cappuccino
     * @param programNumber
     */

    public void makeCoffee(int programNumber, List<CondimentIF> condimentIFList) {
        switch (programNumber){
            case 1:
                this.brew("com.CoffeeMaker.Coffee.CoffeeRegular");
                break;
            case 2:
                this.brew("com.CoffeeMaker.Coffee.CoffeeMocha");
                break;
            case 3:
                this.brew("com.CoffeeMaker.Coffee.CoffeeLatte");
                break;
            case 4:
                this.brew("com.CoffeeMaker.Coffee.CoffeeEspresso");
                break;
            case 5:
                this.brew("com.CoffeeMaker.Coffee.CoffeeCappuccino");
                break;
            default:
                System.out.println("Invalid Program Number");
        }
    }

    /**
     * This class loads and start a specific coffee program
     */
    private void brew(String classPath){
        ClassLoader loader = this.getClass().getClassLoader();
        Class<CoffeeIF> loadedClass;
        try{
            loadedClass = (Class<CoffeeIF>) loader.loadClass(classPath);
            this.currentCoffee = loadedClass.getDeclaredConstructor().newInstance();
            this.currentCoffee.setEnvironment(this);
            this.currentCoffee.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
