package com.inspire.DesignProblems.VendingMachine;

public enum Coins {

    FIVE_CENTS(5),TEN_CENTS(10),TWENTY_FIVE_CENTS(25),FIFTY_CENTS(50),ONE_DOLLER(100);
    private int cents;
    Coins(int cent){
        this.cents=cent;
    }

    public int getCentsInt(){return cents;}
}
