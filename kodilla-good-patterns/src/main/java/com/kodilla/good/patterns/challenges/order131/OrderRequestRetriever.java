package com.kodilla.good.patterns.challenges.order131;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        User user = new User("Jan", "Kowalski","JanKow1");
        LocalDateTime orderTime = LocalDateTime.of(2021,1,16,10,38);

        return new OrderRequest(user, orderTime);
    }
}
