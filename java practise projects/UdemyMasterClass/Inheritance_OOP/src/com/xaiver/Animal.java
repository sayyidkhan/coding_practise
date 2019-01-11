package com.xaiver;

public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    // animal movements //
    public void eat(){
        System.out.println("Animal.eat() called");
    }

    public void move(int speed){
        System.out.print("Animal.move() called");
        System.out.print(", Animal is moving at " + speed);
    }
    // animal movements //

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
}
