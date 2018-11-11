package com.inspire.Decorator;

public class PizzaMaker  {
    public static void main (String[] args){
        Pizza newPizzaWithToppings=new TomotoSaucePizza(new CheezeBurstPizza( new PlainPizza()));
        System.out.println(newPizzaWithToppings.getDescription());
        System.out.println(newPizzaWithToppings.getCost());
    }
}
