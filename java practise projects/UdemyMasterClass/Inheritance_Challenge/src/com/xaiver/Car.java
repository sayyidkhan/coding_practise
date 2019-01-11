package com.xaiver;

public class Car extends Vehicle {

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    private String carType;
    private int currentGear = 0;
    private int currentSpeed = 0;

    public Car(String color,String carType) {
        super("car", color, 4);
        this.carType = carType;

    }

    public void currentGear(int gearNumber){
        if (gearNumber > 0 && gearNumber < 7){
            this.currentGear = gearNumber;
            changeSpeed(gearNumber);
        }
    }

    private void changeSpeed(int gearNumber){
        System.out.println("gear" + gearNumber);
        switch(gearNumber) {
            case 1:
                this.currentSpeed = 20;
                break;
            case 2:
                this.currentSpeed = 40;
                break;
            case 3:
                this.currentSpeed = 60;
                break;
            case 4:
                this.currentSpeed = 80;
                break;
            case 5:
                this.currentSpeed = 100;
                break;
            case 6:
                this.currentSpeed = 120;
                break;
            }
        System.out.println("Vehicle Current Speed is : " + this.currentSpeed);
        }

}
