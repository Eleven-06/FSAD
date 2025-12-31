package com.maven;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven");
    }
}

class ElectricCar extends Car {
    void chargeBattery() {
        System.out.println("Electric car battery is charging");
    }

    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.start(); 
        ec.drive();     
        ec.chargeBattery();  
    }
}
