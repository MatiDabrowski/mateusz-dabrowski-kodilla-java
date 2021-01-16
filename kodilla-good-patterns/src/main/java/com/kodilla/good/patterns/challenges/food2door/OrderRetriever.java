package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class OrderRetriever {
    private List<OrderConfirmation> orderList = new ArrayList<>();

    public ArrayList<OrderConfirmation> retrieve(){
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        HealthyShop healthyShop = new HealthyShop();

        Product jajka = new Product("jajka");
        Product bulki = new Product("bułki");
        Product chipsy = new Product("chipsy");

        OrderConfirmation orderForGluten = new OrderConfirmation(glutenFreeShop, 1,jajka,true);
        OrderConfirmation orderForFoodShop = new OrderConfirmation(extraFoodShop, 4,bulki,true);
        OrderConfirmation orderForHealthy = new OrderConfirmation(healthyShop, 4,chipsy,true);

        orderList.add(orderForFoodShop);
        orderList.add(orderForGluten);
        orderList.add(orderForHealthy);

        return new ArrayList<>(orderList);

    }



}
