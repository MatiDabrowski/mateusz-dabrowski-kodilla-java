package com.kodilla.good.patterns.challenges.order131;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order(User user, LocalDateTime orderTime);
}
