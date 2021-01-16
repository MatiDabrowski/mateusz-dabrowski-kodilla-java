package com.kodilla.good.patterns.challenges.order131;

import java.time.LocalDateTime;

public class Product implements OrderService{
    @Override
    public boolean order(User user, LocalDateTime orderTime) {
        return false;
    }
}
