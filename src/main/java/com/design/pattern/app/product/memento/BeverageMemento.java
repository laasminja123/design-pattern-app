package com.design.pattern.app.product.memento;

public class BeverageMemento {
    private int drinkId;
    private String drinkName;
    private double drinkPrice;

    public BeverageMemento(int drinkId, String drinkName, double drinkPrice) {
        this.drinkId = drinkId;
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
    }

    public int getDrinkId() {
        return drinkId;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    @Override
    public String toString(){
        return "Current drink type is" + this.drinkName + ". Current drink price is "+ this.drinkPrice + ".";
    }
}
