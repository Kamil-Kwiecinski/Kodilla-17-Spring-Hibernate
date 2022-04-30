package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.Random;

public class BallOrderRepository implements ProductOrderRepository{

    @Override
    public boolean generateOrder(User user, Product product, int numberOfProducts, LocalDateTime date) {
        return new Random().nextBoolean();
    }
}
