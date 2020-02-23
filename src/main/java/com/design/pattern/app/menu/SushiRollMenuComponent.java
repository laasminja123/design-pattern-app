package com.design.pattern.app.menu;

public abstract class SushiRollMenuComponent {

    public void add(SushiRollMenuComponent sushiRollMenuComponent){
        throw new UnsupportedOperationException("Cannot add sushi roll to menu.");
    }
    public void remove(SushiRollMenuComponent SushiRollMenuComponent){
        throw new UnsupportedOperationException("Cannot remove sushi roll from menu.");
    }

    public String getName(){
        throw new UnsupportedOperationException("Cannot return sushi roll name.");
    }
    public double getPrice(){
        throw new UnsupportedOperationException("Cannot return sushi roll price.");
    }
    public void returnAllSushiRolls(){
        throw new UnsupportedOperationException("Cannot return all sushi rolls.");
    }

}
