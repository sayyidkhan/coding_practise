package com.me;

public class DogMain {

    public static void main(String[] args) {

        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover)); // compares with they are the same Dog
        System.out.println(rover.equals(rover2)); // compares with they are the same labrador

    }


}
