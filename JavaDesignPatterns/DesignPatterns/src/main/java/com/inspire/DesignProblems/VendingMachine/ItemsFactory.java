package com.inspire.DesignProblems.VendingMachine;

public class ItemsFactory {

    public Item getItems(String itemName){
        if(itemName.equals("ICE-CREAM")){
            return new IceCream();
        }else if (itemName.equals("CHIPS")){
            return new Chips();
        }else if(itemName.equals("SOFT-DRINK")){
            return new SoftDrink();
        }else {
            try{
                 throw new InvalidItemType(itemName);
            }catch (Exception e){

            }

        }
        return null;
    }
}
