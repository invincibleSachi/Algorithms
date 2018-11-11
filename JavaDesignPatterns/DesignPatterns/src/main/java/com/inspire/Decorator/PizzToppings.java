package com.inspire.Decorator;

public abstract class PizzToppings implements Pizza{
    Pizza pizza;
    PizzToppings(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
