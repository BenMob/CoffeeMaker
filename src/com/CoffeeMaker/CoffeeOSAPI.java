package com.CoffeeMaker;

import com.CoffeeMaker.Coffee.CoffeeIF;
import com.CoffeeMaker.Condiment.CondimentIF;

public interface CoffeeOSAPI {
    CoffeeOSAPI setCoffeeType(String str);
    CoffeeOSAPI setGrindingTime(int secs);
    CoffeeOSAPI addCondiment(CondimentIF type);
    CoffeeOSAPI setTemperature(int degree);
    CoffeeOSAPI holdTemperature(int degree);
    CoffeeOSAPI wait(int seconds);
    CoffeeOSAPI setPowerLED(int num);
    CoffeeOSAPI setTypeLED(int num);
    CoffeeOSAPI computePrice(CoffeeIF coffee);
    CoffeeOSAPI done();
}
