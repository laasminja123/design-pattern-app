package com.design.pattern.app.factory.impl;

import com.design.pattern.app.factory.SushiRollBaseFactory;
import com.design.pattern.app.product.SushiRoll;
import com.design.pattern.app.product.impl.CaliforniaRoll;
import com.design.pattern.app.product.impl.SpicyTunaRoll;
import com.design.pattern.app.product.impl.VegetarianRoll;

public class SushiRollRigaFactory extends SushiRollBaseFactory{

    @Override
    public SushiRoll createSushiRoll(String type) {
        SushiRoll sushiRoll;
        switch (type.toLowerCase())
        {
            case "spicytuna":
                sushiRoll = new SpicyTunaRoll("Spicy Tuna Roll Set", 23.00, true);
                break;
            case "vegetarian":
                sushiRoll = new VegetarianRoll("Vegetarian Roll Set", 25.00, false);
                break;
            case "california":
                sushiRoll = new CaliforniaRoll("California Roll Set", 17.00, true);
                break;
            default: throw new IllegalArgumentException("No such sushi roll.");
        }
        sushiRoll.addIngredients();
        sushiRoll.createSushiRoll();
        return sushiRoll;

    }

}
