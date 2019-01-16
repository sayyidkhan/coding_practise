package com.xaiver;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // encapsulation helps to restrict access for the inner working of a class

        Player player = new Player();
        player.fullName = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthRemaining());

        System.out.println("##########################");
        player.health = 200; // without encapsulation, the health can be changed

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthRemaining());


    }
}
