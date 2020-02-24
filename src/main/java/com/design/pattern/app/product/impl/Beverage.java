package com.design.pattern.app.product.impl;

import com.design.pattern.app.product.memento.BeverageMemento;

public class Beverage {
    private int drinkId;
    private String drinkName;
    private double drinkPrice;

    public Beverage(int drinkId, String drinkName, double drinkPrice) {
        this.drinkId = drinkId;
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
    }

    public int getDrinkId() {
        return drinkId;
    }


    public void setDrinkId(int drinkId) {
        this.drinkId = drinkId;
    }


    public String getDrinkName() {
        return drinkName;
    }


    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }


    public double getDrinkPrice() {
        return drinkPrice;
    }


    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }


    public BeverageMemento saveToMemento() {
        BeverageMemento BeverageMemento = new BeverageMemento(this.drinkId, this.drinkName, this.drinkPrice);
        return BeverageMemento;
    }

    public  void undoFromMemento(BeverageMemento memento) {
        this.drinkId = memento.getDrinkId();
        this.drinkName = memento.getDrinkName();
        this.drinkPrice = memento.getDrinkPrice();
    }

    public void printInfo() {
        System.out.println("Drink name : " + this.drinkName);
        System.out.println("Drink price : " + this.drinkPrice);
    }

}
