package com.design.pattern.app.factory;

import com.design.pattern.app.product.SushiRoll;

public abstract class SushiRollBaseFactory {

    public abstract SushiRoll createSushiRoll(String type);
}
