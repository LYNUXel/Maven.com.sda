package com.sda.generics;

public class Main {
    public static void main(String[] args) {
        Garage<Car> garage = new Garage(new Car[5]);
        Car car1 = new Car("Volvo");
        Car car2 = new Car("Dacia");
        garage.addVehicle(car1);
        garage.addVehicle(car2);
        garage.showGarage();
        Garage<Scuter> scuterGarage = new Garage<>(new Scuter[5]);
        Scuter scuter1 =  new Scuter("Vespa");
        scuterGarage.addVehicle(scuter1);
        scuterGarage.showGarage();
        // Can't be duplicate because extends Vehicle Class
        // Garage<String> abc = new Garage<String>(new String[5]);
    }
}
