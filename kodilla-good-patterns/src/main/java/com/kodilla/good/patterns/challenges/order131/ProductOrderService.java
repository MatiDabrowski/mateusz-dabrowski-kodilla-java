package com.kodilla.good.patterns.challenges.order131;

public class ProductOrderService {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new Product(), new ProductRepository());
        orderProcessor.process(orderRequest);

    }
}
