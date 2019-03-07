package com.xaiver;

class Car {

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engineStatus = false;

        this.currentVelocity = 0;

    }

    public Car() {
        this.name = "no name";
        this.engine = true;
        this.engineStatus = false;
        this.cylinders = 4;
        this.wheels = 4;
        this.currentVelocity = 0;
    }

    private String name;
    private boolean engine;

    private boolean engineStatus;
    private int cylinders;
    private int wheels;

    private int currentVelocity;

    // Create some methods like startEngine, accelerate, and brake
    public void startStopEngine(){
        if(!(this.engineStatus)){
            this.engineStatus = true;
            System.out.println("engine is turned on");
        }
        else{
            this.engineStatus = false;
            System.out.println("engine is turned off");
        }
    }

    public void move(int speed){
        if(this.engineStatus){
            this.currentVelocity += speed;
            if(speed > 0) {
                System.out.println("Car is accelerating at " + speed + " /mph");
            }
            else if(speed < 0){
                System.out.println("Car is decelerating at " + (-speed) + " /mph");
            }
            System.out.println("Current Speed " + this.currentVelocity);
        }
    }

    public void brake(){
        this.currentVelocity = 0;
        System.out.println("Car is braked. " + "Current velocity is " + this.currentVelocity);
    }

    public void stop(){
        this.currentVelocity = 0;
    }



    // getters function //

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean getEngineStatus() {
        return engineStatus;
    }

    // getters function //

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngineStatus(boolean engineStatus) {
        this.engineStatus = engineStatus;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

}


class Ferrari extends Car{

    public Ferrari() {
        super("Ferrari", 6);
    }

    @Override
    public void move(int speed) {
        if (this.getEngineStatus()) {
            int currentSpeed = this.getCurrentVelocity();
            if (speed > 0) {
                speed += 5;
                System.out.println("Car is accelerating at " + speed + " /mph");
            } else if (speed < 0) {
                speed -= 5;
                System.out.println("Car is decelerating at " + (-speed) + " /mph");
            }
            this.setCurrentVelocity(currentSpeed += speed);
            System.out.println("Current Speed " + this.getCurrentVelocity());
        }
        else{
            System.out.println("engine is not turned on");
        }
    }
}

class Lamborghini extends Car{

    public Lamborghini() {
        super("Lamborghini", 8);
    }

    @Override
    public void move(int speed) {
        if (this.getEngineStatus()) {
            int currentSpeed = this.getCurrentVelocity();
            if (speed > 0) {
                speed += 10;
                System.out.println("Car is accelerating at " + speed + " /mph");
            } else if (speed < 0) {
                speed -= 10;
                System.out.println("Car is decelerating at " + (-speed) + " /mph");
            }
            this.setCurrentVelocity(currentSpeed += speed);
            System.out.println("Current Speed " + this.getCurrentVelocity());
        }
        else{
            System.out.println("engine is not turned on");
        }
    }
}

class lotusElise extends Car{

    public lotusElise() {
        super("lotusElise", 8);
    }

    @Override
    public void move(int speed) {
        if (this.getEngineStatus()) {
            int currentSpeed = this.getCurrentVelocity();
            if (speed > 0) {
                speed += 2;
                System.out.println("Car is accelerating at " + speed + " /mph");
            } else if (speed < 0) {
                speed -= 2;
                System.out.println("Car is decelerating at " + (-speed) + " /mph");
            }
            this.setCurrentVelocity(currentSpeed += speed);
            System.out.println("Current Speed " + this.getCurrentVelocity());
        }
        else{
            System.out.println("engine is not turned on");
        }
    }

}


public class Main {

    public static void main(String[] args) {
        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generic car class.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //


        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).

        Car subaru = new Car();
        subaru.startStopEngine();

        subaru.move(20);
        subaru.move(20);
        subaru.move(-20);

        subaru.brake();
        System.out.println("#######");
        System.out.println();


        Car ferrari = new Ferrari();
        System.out.println(ferrari.getName());
        ferrari.startStopEngine();
        ferrari.move(40);
        ferrari.move(-20);
        ferrari.stop();
        System.out.println("#######");
        System.out.println();

        Car Lamborghini = new Lamborghini();
        System.out.println(Lamborghini.getName());
        Lamborghini.startStopEngine();
        Lamborghini.move(40);
        Lamborghini.move(-20);
        Lamborghini.stop();
        System.out.println("#######");
        System.out.println();

        Car lotusElise = new lotusElise();
        System.out.println(lotusElise.getName());
        lotusElise.startStopEngine();
        lotusElise.move(40);
        lotusElise.move(-20);
        lotusElise.stop();
        System.out.println("#######");
        System.out.println();



    }
}
