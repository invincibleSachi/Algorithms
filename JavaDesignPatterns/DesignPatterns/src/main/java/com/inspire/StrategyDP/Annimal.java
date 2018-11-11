package com.inspire.StrategyDP;

public class Annimal {

    public void eats(){

        }
    RunAbility runability;

    public FlyAbility getFlyAbility() {
        return flyAbility;
    }

    public void setFlyAbility(FlyAbility flyAbility) {
        this.flyAbility = flyAbility;
    }

    FlyAbility flyAbility;

    public RunAbility getRunability() {
        return runability;
    }

    public void setRunability(RunAbility runability) {
        this.runability = runability;
    }
}
