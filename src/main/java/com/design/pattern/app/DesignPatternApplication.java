package com.design.pattern.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.design.pattern.app.factory.SushiRollBaseFactory;
import com.design.pattern.app.factory.impl.SushiRollRigaFactory;
import com.design.pattern.app.menu.SushiRollMenuComponent;
import com.design.pattern.app.menu.impl.SushiRollMenu;
import com.design.pattern.app.product.SushiRoll;
import com.design.pattern.app.service.facade.controller.OrderFulfillmentController;
import com.design.pattern.app.service.facade.impl.OrderServiceFacadeImpl;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {
        SushiRollBaseFactory sushiRollFactory = new SushiRollRigaFactory();
        SushiRoll spicyTunaRoll = sushiRollFactory.createSushiRoll("spicytuna");
        System.out.println();
        SushiRoll vegetarianRoll = sushiRollFactory.createSushiRoll("vegetarian");
        System.out.println();
        SushiRoll californiaRoll = sushiRollFactory.createSushiRoll("california");

        SushiRollMenuComponent sushiRollMenuComponentVegetarian = new SushiRollMenu("Vegetarian Menu");
        sushiRollMenuComponentVegetarian.add(vegetarianRoll);

        SushiRollMenuComponent sushiRollMenuComponentBase = new SushiRollMenu("Base Menu");
        sushiRollMenuComponentBase.add(spicyTunaRoll);
        sushiRollMenuComponentBase.add(californiaRoll);

        SushiRollMenuComponent fullMenu = new SushiRollMenu("Full Menu");
        fullMenu.add(sushiRollMenuComponentVegetarian);
        fullMenu.add(sushiRollMenuComponentBase);

        System.out.println();
        System.out.println("Available sushi rolls in " + sushiRollMenuComponentVegetarian.getName());
        sushiRollMenuComponentVegetarian.returnAllSushiRolls();

        System.out.println();
        System.out.println("Available sushi rolls in " + sushiRollMenuComponentBase.getName());
        sushiRollMenuComponentBase.returnAllSushiRolls();

        System.out.println();
        System.out.println("Available sushi rolls in " + fullMenu.getName());
        fullMenu.returnAllSushiRolls();

        System.out.println();
        OrderFulfillmentController controllerSpicyTuna = new OrderFulfillmentController();
        controllerSpicyTuna.facade = new OrderServiceFacadeImpl();
        controllerSpicyTuna.orderProduct(spicyTunaRoll);
        System.out.println("Order fulfilled: " + controllerSpicyTuna.orderFulfilled);

        System.out.println();
        OrderFulfillmentController controllerVegetarian = new OrderFulfillmentController();
        controllerVegetarian.facade = new OrderServiceFacadeImpl();
        controllerVegetarian.orderProduct(vegetarianRoll);
        System.out.println("Order fulfilled: " + controllerVegetarian.orderFulfilled);

        System.out.println();
        OrderFulfillmentController controllerCalifornia = new OrderFulfillmentController();
        controllerCalifornia.facade = new OrderServiceFacadeImpl();
        controllerCalifornia.orderProduct(californiaRoll);
        System.out.println("Order fulfilled: " + controllerCalifornia.orderFulfilled);
    }

}
