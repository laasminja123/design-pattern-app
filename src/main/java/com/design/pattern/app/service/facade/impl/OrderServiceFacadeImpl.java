package com.design.pattern.app.service.facade.impl;

import com.design.pattern.app.product.SushiRoll;
import com.design.pattern.app.service.facade.OrderServiceFacade;
import com.design.pattern.app.services.DeliverService;
import com.design.pattern.app.services.PaymentService;

public class OrderServiceFacadeImpl implements OrderServiceFacade{
    public boolean placeOrder(SushiRoll sushiRoll){
        boolean orderFulfilled=false;
            if(sushiRoll.getAvailable() == true) {
                System.out.println("Sushi roll: "+ sushiRoll.getName() + " is available.");
                boolean paymentConfirmed= PaymentService.makePayment();
                if(paymentConfirmed){
                    System.out.println("Payment confirmed...");
                    DeliverService.deliverSushi(sushiRoll);
                    System.out.println("Product delivering...");
                    orderFulfilled=true;
                }
            } else {
                System.out.println("Sushi roll: "+ sushiRoll.getName() + " isn't available. Try again later!");
            }
        return orderFulfilled;
    }
}
