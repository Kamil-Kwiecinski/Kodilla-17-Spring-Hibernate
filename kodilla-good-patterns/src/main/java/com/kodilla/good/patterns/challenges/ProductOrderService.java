package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String[] args) {
        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailInformService(),
                new BallTransactionService(), new BallOrderRepository());
        ProductOrderRequestCollect productOrderRequestCollect = new ProductOrderRequestCollect();
        ProductOrderRequest productOrderRequest = productOrderRequestCollect.collect();
        productOrderProcessor.process(productOrderRequest);
    }
}
