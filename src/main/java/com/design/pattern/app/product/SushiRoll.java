package com.design.pattern.app.product;

import com.design.pattern.app.menu.SushiRollMenuComponent;

public abstract class SushiRoll extends SushiRollMenuComponent {

    final static int NO_AVAILBALE_SUSHI_TYPE = 0;
    final static int AVAILBALE_SUSHI_TYPE = 1;
    private String name;
    private double price;
    private boolean available;
    int state = NO_AVAILBALE_SUSHI_TYPE;

    public SushiRoll(String name, double price, boolean available) {
        this.name = name;
        this.price = price; 
        this.available = available;
        if(available == true) {
            state = AVAILBALE_SUSHI_TYPE;
        }
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
    public boolean getAvailable() {
        return this.available;
    }

    @Override
    public void returnAllSushiRolls(){
        System.out.println("Sushi Roll name: "+ name +" Price: " + price);
    }

    public abstract void addIngredients();

    public void createSushiRoll() {
        System.out.println("Ordered sushi roll is created.");
    }

    public void getState(){
        if(state == NO_AVAILBALE_SUSHI_TYPE) {
            System.out.println("Sorry, this sushi roll not available at the moment. Please, try again later!");
        } else if (state == AVAILBALE_SUSHI_TYPE) {
            System.out.println("Have a nice meal!");
        }
    }
}
