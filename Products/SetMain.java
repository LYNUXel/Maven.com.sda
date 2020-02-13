package com.sda.Products;

import java.util.*;

public class SetMain {
    public static void main(String[] args) {
        // Set<Product> productsSet = new HashSet<Product>();
        // with HasSet = list is not ordered
        Set<Product> productsSet = new LinkedHashSet<Product>();
        //Set<E> doesn't print the duplicate products
        productsSet.add(new Product("Ciocolata",42.5, 203));
        productsSet.add(new Product("Bomboane",41.5, 53));
        productsSet.add(new Product("Bomboane",41.5, 53)); // Isn't shown !!!
        productsSet.add(new Product("Whater",43.5, 23));
        productsSet.add(new Product("IceCream",43, 33));
        productsSet.add(new Product("Bomboane",10, 53));

        System.out.println(productsSet);
        System.out.println();

       // HashSet<Product>
       // Collections.sort(List<productsSet>); = DOESN'T WORK !!!!

        List<Product> productList = new ArrayList<>();
        productList.addAll(productsSet);
        Collections.sort(productList);
        System.out.println(productList);
    }
}
