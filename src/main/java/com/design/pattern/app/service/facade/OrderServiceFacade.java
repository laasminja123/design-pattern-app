package com.design.pattern.app.service.facade;

import com.design.pattern.app.product.SushiRoll;

public interface OrderServiceFacade {
    boolean placeOrder(SushiRoll sushiRollType);
}
