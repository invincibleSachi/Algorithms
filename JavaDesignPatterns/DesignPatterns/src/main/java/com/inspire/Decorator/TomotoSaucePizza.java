package com.inspire.Decorator;

public class TomotoSaucePizza extends PizzToppings {
    Pizza pizza;
    TomotoSaucePizza(Pizza pizza){
        super(pizza);
        this.pizza=pizza;
    }

    public String getDescription(){
        return pizza.getDescription() +" with tomato sauce";
    }

    public double getCost(){
        return pizza.getCost()+0.2;
    }
}
