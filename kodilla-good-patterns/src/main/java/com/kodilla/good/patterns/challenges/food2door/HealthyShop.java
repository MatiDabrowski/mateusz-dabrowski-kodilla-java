package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements FoodVendor {
    private String name = "HealthyShop";
    @Override
    public OrderDto process(OrderConfirmation orderConfirmation) {
        if(orderConfirmation.isOrdered()){
            System.out.println("HealthyShop True");
            return new OrderDto(name, true, orderConfirmation.getQuantity(), orderConfirmation.getProduct());
        } else {
            System.out.println("HealthyShop False");
            return new OrderDto(name, false, orderConfirmation.getQuantity(), orderConfirmation.getProduct());
        }

    }
}
