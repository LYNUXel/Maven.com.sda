package com.sda.Products;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new LinkedList<Product>();
        products.add(new Product("Chocolate",42.5, 203));
        products.add(new Product("Chocolate",42.5, 203));
        products.add(new Product("Candy's",41.5, 53));
        products.add(new Product("IceCream",43, 33));
        System.out.println(products.toString());

        Collections.sort(products);

        System.out.println(products.contains(new Product("Candy's",41.5, 53))); // return true
        System.out.println(products.contains(new Product("Water",43.5, 23))); // return false

        products.remove(new Product("Chocolate", 42.5,203));
        //remove only one product !!!
        System.out.println(products);

    }
}
