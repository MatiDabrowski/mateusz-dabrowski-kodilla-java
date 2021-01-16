package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class ProductOrderService {
    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        ArrayList<OrderConfirmation> orders = orderRetriever.retrieve();

        for(OrderConfirmation order: orders){
            OrderDto orderDto = order.getFoodVendor().process(order);
            if (orderDto.isOrdered()) {
                System.out.println("Zamówienie dla dostawcy: " + orderDto.getVendorName());
            }
        }

    }
}
