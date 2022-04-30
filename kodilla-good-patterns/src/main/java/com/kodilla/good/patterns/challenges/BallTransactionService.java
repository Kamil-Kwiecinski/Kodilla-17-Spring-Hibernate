package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.Random;

public class BallTransactionService implements Transaction{

    @Override
    public boolean isSold(User user, Product product, int numberOfProducts, LocalDateTime date) {
        return new Random().nextBoolean();
    }
}
