package com.sda.generics;

public class Garage <T extends Vehicle>{
    private int n;
    private T[] vehicles;
    public Garage (T[] vehicles){
        n = 0;
        this.vehicles = vehicles;
    }
    public void addVehicle(T vehicle){
        if(n < vehicles.length){
            vehicles[n] = vehicle;
            n++;
        } else{
            System.out.println("Garage is full!");
        }
    }
    public void showGarage(){
        System.out.println("Garage has: ");
        for (int i = 0; i < n; i++) {
            System.out.println("° " + vehicles[i].toString());
        }
    }
}