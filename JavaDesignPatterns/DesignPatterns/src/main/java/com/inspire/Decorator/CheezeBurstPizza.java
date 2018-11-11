package com.inspire.Decorator;

public class CheezeBurstPizza extends PizzToppings {
    Pizza pizza;
    CheezeBurstPizza(Pizza pizza){
        super(pizza);
        this.pizza=pizza;
    }

    public String getDescription(){
        return pizza.getDescription() +" with cheeze burst";
    }

    public double getCost(){
        return pizza.getCost()+0.5;
    }
}
