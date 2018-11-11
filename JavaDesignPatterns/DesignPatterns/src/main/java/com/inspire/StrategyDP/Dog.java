package com.inspire.StrategyDP;

public class Dog extends Annimal {
    Dog(){
        setFlyAbility(new CanFly());
        setRunability(new CanRun());
    }
    @Override
    public void eats() {
        System.out.println("Annimal eats");
    }
}
