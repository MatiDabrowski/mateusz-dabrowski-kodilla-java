package com.kodilla.good.patterns.challenges.order131;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime orderTime;

    public OrderRequest(final User user, final LocalDateTime orderTime) {
        this.user = user;
        this.orderTime = orderTime;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}
