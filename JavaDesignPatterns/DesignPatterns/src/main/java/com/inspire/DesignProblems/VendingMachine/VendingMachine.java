package com.inspire.DesignProblems.VendingMachine;

import java.util.List;

public interface VendingMachine {
    public List<Item> stock=null;
    List<Coins> refund=null;
    public Item getItem(Coins c, Item item);
    public Item getItems(Coins c, List<Item> item);
    public void addItem(Item item);
    public void reset();
}
