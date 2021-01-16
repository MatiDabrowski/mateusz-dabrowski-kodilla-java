package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements FoodVendor {
    private String name = "GlutenFreeShop";


    @Override
    public OrderDto process(OrderConfirmation orderConfirmation) {
        if(orderConfirmation.isOrdered()){
            System.out.println("GlutenFreeShop True");
            return new OrderDto(name, true, orderConfirmation.getQuantity(), orderConfirmation.getProduct());
        } else {
            System.out.println("GlutenFreeShop False");
            return new OrderDto(name, false, orderConfirmation.getQuantity(), orderConfirmation.getProduct());
        }

    }
}
