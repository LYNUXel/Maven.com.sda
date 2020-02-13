package com.sda.generics;

public class Car extends Vehicle implements Comparable<Car> {
    public Car(String name) {
        super(name);
    }

    public int compareTo(Car o) {
        return this.getName().compareTo(o.getName());
    }

//    this was
//    @Override
//    public int compareTo(Car o) {
//
//        return 0; // @return a negative integer, zero, or a positive integer as this object
//                  //is less than, equal to, or greater than the specified object.


}

