package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.invoice.dao.InvoiceDao;
import com.kodilla.hibernate.invoice.dao.ProductDao;
import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.TaskList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    @Autowired
    InvoiceDao invoiceDao;


    @Test
    void testInvoiceDaoSave(){
        //Given
        Product product = new Product("Karma");
        Product product1 = new Product("Gryzak");
        Product product2 = new Product("Szarpak");
        Product product3 = new Product("Smycz");

        Item item = new Item(product3,new BigDecimal(10) ,1);
        Item item2 = new Item(product2, new BigDecimal(15.5), 2);



        Invoice invoiceList = new Invoice("FZ/01/0002");
        invoiceList.getItems().add(item);
        invoiceList.getItems().add(item2);
        item.setInvoice(invoiceList);
        item2.setInvoice(invoiceList);


        //When
        invoiceDao.save(invoiceList);
        int id = invoiceList.getId();

        //Then
        assertNotEquals(0, id);


        //CleanUp
        //invoiceDao.deleteById(id);
    }
}
