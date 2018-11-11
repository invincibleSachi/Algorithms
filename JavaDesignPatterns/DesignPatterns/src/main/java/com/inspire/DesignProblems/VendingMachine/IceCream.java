package com.inspire.DesignProblems.VendingMachine;

public class IceCream extends Item {
    final int price=Coins.FIFTY_CENTS.getCentsInt();
    public IceCream(){
        super("ICE-CREAM");
        setItemPrice(price);
    }
}
