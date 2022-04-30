package com.kodilla.good.patterns.challenges;

public class ProductOrderProcessor {

    private InformationService informationService;
    private Transaction transaction;
    private ProductOrderRepository productOrderRepository;

    public ProductOrderProcessor(InformationService informationService, Transaction transaction,
                                 ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.transaction = transaction;
        this.productOrderRepository = productOrderRepository;
    }

    public ProductOrderDTO process(ProductOrderRequest productOrderRequest){
        boolean isSold = transaction.isSold(productOrderRequest.getUser(), productOrderRequest.getProduct(),
                productOrderRequest.getNumberOfProducts(), productOrderRequest.getDate());
        if (isSold) {
            informationService.inform(productOrderRequest.getUser());
            productOrderRepository.generateOrder(productOrderRequest.getUser(), productOrderRequest.getProduct(),
                    productOrderRequest.getNumberOfProducts(), productOrderRequest.getDate());
            return new ProductOrderDTO(productOrderRequest.getUser(), productOrderRequest.getProduct(),
                    productOrderRequest.getNumberOfProducts(), productOrderRequest.getDate(), true);
        } else {
            return new ProductOrderDTO(productOrderRequest.getUser(), productOrderRequest.getProduct(),
                    productOrderRequest.getNumberOfProducts(), productOrderRequest.getDate(), false);
        }
    }
}
