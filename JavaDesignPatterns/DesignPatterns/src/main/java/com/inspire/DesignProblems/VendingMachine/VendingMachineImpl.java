package com.inspire.DesignProblems.VendingMachine;

import java.util.*;

/**
 * to be implemented
 */

public class VendingMachineImpl implements VendingMachine {
    Map<Item,Integer> inventory=new HashMap<Item,Integer>();
    Map<Coins,Integer> moneyInKitty=new HashMap<Coins,Integer>();
    @Override
    public Item getItem(Coins c, Item item) {
        if(inventory.containsKey(item)){
            if(inventory.get(item)>0){
                if(item.getItemPrice()<=c.getCentsInt()){
                    inventory.put(item,inventory.get(item)-1);
                    Map<Coins,Integer> returnedVal=returnChange(c,item.getItemPrice());
                    //Print returned coins
                    return item;
                }else {
                    System.out.println("Entered coin is not sufficient to buy this item.");
                }

            }else {
                try{
                    throw new InsufficientItemsException(item);
                }catch (Exception e){

                }
                return null;
            }

        }else {
            return null;
        }
        return item;
    }

    @Override
    public Item getItems(Coins c, List<Item> item) {
        return null;
    }

    @Override
    public void addItem(Item item) {
        if(inventory.containsKey(item)){
            inventory.put(item,inventory.get(item)+1);
        }else {
            inventory.put(item,1);
        }

    }

    @Override
    public void reset() {

    }

    public Map<Coins,Integer> returnChange(Coins c, int price){
        int balance =c.getCentsInt()-price;
        if(balance==0){
            return null;
        }
        if(balance<totalMoneyInKitty()){
            try{
                throw new InsufficientChangeException();
            }
            catch (Exception e){

            }
            return null;
        }else {
            return returnCoins(balance);
        }

    }

    public int totalMoneyInKitty(){
        Set<Coins> coins=moneyInKitty.keySet();
        int totalAmount=0;
        Iterator<Coins> i=coins.iterator();
        while ((i.hasNext())){
            Coins c=i.next();
            totalAmount=totalAmount+c.getCentsInt()*moneyInKitty.get(c);
        }
        return totalAmount;
    }

    public Map<Coins,Integer> returnCoins(int balanceAmount){
        Map<Coins,Integer> returnCoins=new HashMap<Coins,Integer>();
        Set<Coins> coinSet=EnumSet.allOf(Coins.class);
        Iterator<Coins> it=coinSet.iterator();

        while(balanceAmount!=0 && it.hasNext()){
            Coins c=it.next();
            if(moneyInKitty.containsKey(c)){
                int noOfCoinsneeded=balanceAmount/c.getCentsInt();
                if(noOfCoinsneeded>moneyInKitty.get(c)){
                    balanceAmount=balanceAmount-c.getCentsInt()*moneyInKitty.get(c);
                    returnCoins.put(c,moneyInKitty.get(c));
                }else {
                    balanceAmount=balanceAmount-noOfCoinsneeded*c.getCentsInt();
                    returnCoins.put(c,moneyInKitty.get(c));
                }
            }
        }
        if(balanceAmount==0){
            Set<Coins> c=returnCoins.keySet();
            Iterator<Coins> itc=coinSet.iterator();
            while(itc.hasNext()){
                Coins c1=itc.next();
                moneyInKitty.put(c1,moneyInKitty.get(c1)-returnCoins.get(c1));
            }
        }else {
            try{
                throw new InsufficientChangeException();
            }
            catch (Exception e){

            }
            return null;
        }
        return returnCoins;
    }
}
