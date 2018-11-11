package com.inspire.DesignProblems.VendingMachine;

public class SoftDrink extends Item {
    final int price=Coins.TWENTY_FIVE_CENTS.getCentsInt();
    public SoftDrink(){
        super("COLD-DRINKS");
        setItemPrice(price);
    }
}
