package com.design.pattern.app.product.state.impl;

import com.design.pattern.app.product.SushiRoll;
import com.design.pattern.app.product.state.SushiRollState;

public class AvailableSushiTypeState implements SushiRollState{

    SushiRoll sushiRoll;
    public AvailableSushiTypeState(SushiRoll sushiRoll){
        this.sushiRoll = sushiRoll;
    }

    @Override
    public void requestSushiRoll() {
        sushiRoll.getState();
    }

}
