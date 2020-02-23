package com.design.pattern.app.product;

import com.design.pattern.app.menu.SushiRollMenuComponent;

public abstract class SushiRoll extends SushiRollMenuComponent {

    private String name;
    private double price;
    public SushiRoll (String name, double price){
        this.name=name;
        this.price=price;
    }

    @Override
    public String getName() {
        return  this.name;
    }
    @Override
    public double getPrice() {
        return this.price;
    }
    @Override
    public void returnAllSushiRolls(){
        System.out.println("Sushi Roll name: "+ name +" Price: " + price);
    }

    public abstract void addIngredients();

    public void createSushiRoll() {
        System.out.println("Ordered sushi roll is created.");
    }
}
