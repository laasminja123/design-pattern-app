package com.design.pattern.app.product.impl;

import com.design.pattern.app.product.SushiRoll;

public class CaliforniaRoll extends SushiRoll{

    public CaliforniaRoll(String name, double price) {
        super(name, price);
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for california roll.");
    }

}
