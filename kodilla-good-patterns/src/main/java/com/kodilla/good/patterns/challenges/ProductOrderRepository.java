package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface ProductOrderRepository {
    boolean generateOrder(User user, Product product, int numberOfProducts, LocalDateTime date);
}
