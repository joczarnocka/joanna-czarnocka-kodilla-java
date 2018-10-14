package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    ProductDao productDao;

    @Autowired
    ItemDao itemDao;

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given

        Invoice invoice1 = new Invoice("2018/01/01");

        Product product1 = new Product("product1");
        Product product2 = new Product("product2");
        Product product3 = new Product("product3");

        Item item11 = new Item(product1, new BigDecimal(100), 10, new BigDecimal(1000));
        Item item12 = new Item(product2, new BigDecimal(1000), 10, new BigDecimal(10000));
        Item item13 = new Item(product3, new BigDecimal(10000), 10, new BigDecimal(10000));

        product1.getItems().add(item11);
        product2.getItems().add(item12);
        product3.getItems().add(item13);

        invoice1.getItems().add(item11);
        invoice1.getItems().add(item12);
        invoice1.getItems().add(item13);

        item11.setInvoice(invoice1);
        item12.setInvoice(invoice1);
        item13.setInvoice(invoice1);

        //When
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();

        //Then
        Assert.assertNotEquals(0, invoice1Id);

        //Clean-Up
        invoiceDao.delete(invoice1);

    }

}
