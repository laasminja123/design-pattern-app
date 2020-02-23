package com.design.pattern.app.product.impl;

import com.design.pattern.app.product.SushiRoll;

public class SpicyTunaRoll extends SushiRoll {

    public SpicyTunaRoll(String name, double price) {
        super(name, price);
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for spicy tuna roll.");
    }

}
