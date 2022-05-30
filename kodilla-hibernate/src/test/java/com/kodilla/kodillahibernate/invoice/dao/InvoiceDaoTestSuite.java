package com.kodilla.kodillahibernate.invoice.dao;

import com.kodilla.kodillahibernate.invoice.Invoice;
import com.kodilla.kodillahibernate.invoice.Item;
import com.kodilla.kodillahibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){
        //Given
        Invoice invoice = new Invoice("001");

        Product product1 = new Product("product1");
        Product product2 = new Product("product2");
        Product product3 = new Product("product3");

        Item item = new Item(product1, new BigDecimal("100"),4,new BigDecimal("400"));
        Item item2 = new Item(product2, new BigDecimal("30"),1,new BigDecimal("30"));
        Item item3 = new Item(product3, new BigDecimal("60"),3,new BigDecimal("180"));

        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        product1.getItems().add(item);
        product2.getItems().add(item2);
        product3.getItems().add(item3);

        item.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);

        //Then
        assertNotEquals(0,invoice.getId());

        //CleanUp
        invoiceDao.deleteById(invoice.getId());
    }
}
