package com.xaiver;

public class Car extends Vehicle {

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

    private int doors;
    private int engineCapacity;


}
