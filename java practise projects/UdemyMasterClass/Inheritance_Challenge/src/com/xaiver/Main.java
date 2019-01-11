package com.xaiver;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Challenge.
        // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        /*  */
        // Finally, create another class, a specific type of Car that inherits from the Car class.
        // You should be able to hand steering, changing gears, and moving (speed in other words).
        // You will want to decide where to put the appropriate state and behaviours (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing speed should be included.


        // For you specific type of vehicle you will want to add something specific for that type of car.

        Vehicle truck = new Vehicle("truck","blue",6);
        // truck info
        System.out.println("vehicle type: " + truck.getVehicleType());
        System.out.println("vehicle color: " + truck.getColor());
        truck.setColor("pink");
        System.out.println("vehicle tyres: " + truck.getTyre());
        // change truck color
        System.out.println("vehicle color: " + truck.getColor());

        //car info
        Car audi = new Car("red","audi");
        System.out.println("car type: " + audi.getCarType());
        System.out.println("Vehicle color: " + audi.getColor());
        System.out.println("Vehicle Tyres: " + audi.getTyre());

        //vehicle current speed
        System.out.println("Vehicle Current speed: " + audi.getCurrentSpeed());

        audi.currentGear(2);
        audi.currentGear(4);
    }


}
