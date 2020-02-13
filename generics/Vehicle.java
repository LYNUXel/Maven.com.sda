package com.sda.generics;

import java.util.Objects;

public abstract class Vehicle {
    private String name;
    public Vehicle(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(name, vehicle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
