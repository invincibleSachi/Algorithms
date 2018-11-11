package com.inspire.DesignProblems.VendingMachine;

public abstract class Item {
    private String itemName = null;
    private int itemPrice = 0;

    public Item(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice){
        this.itemPrice=itemPrice;
    }
}
