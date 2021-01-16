package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements FoodVendor {
    private String name = "ExtraFoodShop";


    @Override
    public OrderDto process(OrderConfirmation orderConfirmation) {
        if(orderConfirmation.isOrdered()){
            System.out.println("ExtraFoodShop True");
            return new OrderDto(name, true, orderConfirmation.getQuantity(), orderConfirmation.getProduct());
        } else {
            System.out.println("ExtraFoodShop False");
            return new OrderDto(name, false, orderConfirmation.getQuantity(), orderConfirmation.getProduct());
        }

    }
}
