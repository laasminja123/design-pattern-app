package com.design.pattern.app.service.facade.controller;

import com.design.pattern.app.product.SushiRoll;
import com.design.pattern.app.service.facade.OrderServiceFacade;

public class OrderFulfillmentController {
    public OrderServiceFacade facade;
    public boolean orderFulfilled = false;
    public void orderProduct(SushiRoll sushiRoll) {
        orderFulfilled = facade.placeOrder(sushiRoll);
        System.out.println("OrderFulfillmentController: Order fulfillment completed.");
    }
}
