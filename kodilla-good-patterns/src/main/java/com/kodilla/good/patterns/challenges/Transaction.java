package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface Transaction {
    boolean isSold(User user, Product product, int numberOfProducts, LocalDateTime date);
}
