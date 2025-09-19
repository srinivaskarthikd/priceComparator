package com.products.priceComparator.service;

import com.products.priceComparator.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class ProductService {

    HashMap<Integer, Product> map=new HashMap();

    public  void addProduct(HashMap<Integer, Product> product){
        this.map.putAll(product);
    }
    public void getProductsSortedByName(){
        ArrayList<Product> ar=new ArrayList<>(map.values());
        ar.sort(Comparator.comparing(Product::getName));
        System.out.println("By Name:");
        ar.forEach(i->System.out.println(i));
    }

    public void getProductsSortedByPrice(){
        TreeSet<Product> tree=new TreeSet<>((s1,s2)->
                Double.compare(s1.getPrice(),s2.getPrice())
        );
        System.out.println("By Price:");
        tree.addAll(map.values());
        tree.forEach(i->System.out.println(i));
    }
}