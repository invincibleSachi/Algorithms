package com.inspire.DesignProblems.VendingMachine;

public class Chips extends Item {
    final int price=Coins.TEN_CENTS.getCentsInt();
    public Chips(){
        super("CHIPS");
        setItemPrice(price);
    }


}
