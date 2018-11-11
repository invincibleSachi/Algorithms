package com.inspire.Decorator;

public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "thin crust pizza";
    }

    @Override
    public double getCost() {
        return 4.0;
    }
}
