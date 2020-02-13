package com.sda.collection;

import com.sda.generics.Car;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CarListMain {
    public static void main(String[] args) {
       List<Car> cars = new LinkedList<Car>();

       cars.add(new Car("Car 1"));
       cars.add(new Car("Car 2"));
       //System.out.println(cars);
       System.out.println(cars);
       cars.add(0, new Car("Car 3"));
       System.out.println(cars);

        // Collections.sort(cars); //cars simple has to be changed to Comparable =>
        Collections.sort(cars);
        System.out.println(cars);

        // Searching an object using contains and equals !!!
        System.out.println(cars.contains(new Car("Car 1")));
        // see in the "Vehicle" the @Overide [ right click => Generate => equals() & hashObject() ]

    }
}
