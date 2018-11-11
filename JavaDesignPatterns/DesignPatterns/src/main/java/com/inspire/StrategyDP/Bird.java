package com.inspire.StrategyDP;

public class Bird extends Annimal {

    Bird(){
        setFlyAbility(new CanFly());
        setRunability(new CantRun());
    }
}
