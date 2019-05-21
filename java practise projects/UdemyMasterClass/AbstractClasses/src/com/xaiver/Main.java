package com.xaiver;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("yorkie");
        dog.breathe();
        dog.eat();

        System.out.println();

        Parrot parrot = new Parrot("Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        System.out.println();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

    }
}
