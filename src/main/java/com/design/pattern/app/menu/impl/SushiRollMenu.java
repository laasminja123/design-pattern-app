package com.design.pattern.app.menu.impl;

import java.util.ArrayList;

import com.design.pattern.app.menu.SushiRollMenuComponent;

public class SushiRollMenu extends SushiRollMenuComponent{

    private ArrayList<SushiRollMenuComponent> sushiRolls = new ArrayList<>();
    private String name;
    public SushiRollMenu(String name){
        this.name=name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void returnAllSushiRolls(){
       for(SushiRollMenuComponent roll : sushiRolls)
        {
            roll.returnAllSushiRolls();
        }
    }
    @Override
    public void add(SushiRollMenuComponent sushiRollMenuComponent){
        sushiRolls.add(sushiRollMenuComponent);
    }
    @Override
    public void remove(SushiRollMenuComponent sushiRollMenuComponent){
        sushiRolls.remove(sushiRollMenuComponent);
    }

}
