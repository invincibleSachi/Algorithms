package com.inspire.DesignProblems.VendingMachine;

public class InvalidItemType extends Exception {
    public InvalidItemType(String itemName ){
        System.out.println( itemName+" is invalid");
    }
}
