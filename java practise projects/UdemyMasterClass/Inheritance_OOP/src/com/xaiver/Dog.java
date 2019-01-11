package com.xaiver;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat; // referring to the fur

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
        // super is to call the constructor that is for the class that we are extending from
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5); // super refers to the parent class, and execute from the parent class
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

//    @Override
//    public void move(int speed) {
//        System.out.println("Dog.move() called");
//        moveLegs(speed);
//        super.move(speed * 2);
//    }
}
