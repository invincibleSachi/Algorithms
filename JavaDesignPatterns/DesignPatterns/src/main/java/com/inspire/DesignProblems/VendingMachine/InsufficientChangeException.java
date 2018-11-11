package com.inspire.DesignProblems.VendingMachine;

public class InsufficientChangeException extends Exception {
    public InsufficientChangeException(){
        System.out.println("There is insufficient refund available");
    }
}
