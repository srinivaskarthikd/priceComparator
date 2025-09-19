package com.products.priceComparator;

import com.products.priceComparator.model.Product;
import com.products.priceComparator.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;

@SpringBootApplication
public class PriceComparatorApplication {

	public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");

        HashMap<Integer, Product> map=(HashMap<Integer, Product>) ctx.getBean("productservice");

        ProductService pro=new ProductService();
        pro.addProduct(map);
        pro.getProductsSortedByName();
        pro.getProductsSortedByPrice();

	}

}
