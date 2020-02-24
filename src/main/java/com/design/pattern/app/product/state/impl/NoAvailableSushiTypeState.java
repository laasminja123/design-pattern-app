package com.design.pattern.app.product.state.impl;

import com.design.pattern.app.product.SushiRoll;
import com.design.pattern.app.product.state.SushiRollState;

public class NoAvailableSushiTypeState implements SushiRollState {

    SushiRoll sushiRoll;
    public NoAvailableSushiTypeState(SushiRoll sushiRoll){
        this.sushiRoll = sushiRoll;
    }
    @Override
    public void requestSushiRoll() {
        sushiRoll.getState();
    }

}
