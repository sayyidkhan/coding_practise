package com.xaiver;

public class Vehicle {

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTyre() {
        return tyre;
    }

    public void setTyre(int tyre) {
        this.tyre = tyre;
    }

    public Vehicle(String vehicleType, String color) {
        this(vehicleType, color, 0);
    }

    public Vehicle(String vehicleType, String color, int tyre) {
        VehicleType = vehicleType;
        this.color = color;
        this.tyre = tyre;
    }

    private String VehicleType;
    private String color;
    private int tyre;


}
