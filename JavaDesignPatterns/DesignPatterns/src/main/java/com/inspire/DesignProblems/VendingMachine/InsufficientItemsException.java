package com.inspire.DesignProblems.VendingMachine;

public class InsufficientItemsException extends Exception {

    public InsufficientItemsException(Item item){
        System.out.println(item.getItemName() + " has insufficient stock");
    }

}