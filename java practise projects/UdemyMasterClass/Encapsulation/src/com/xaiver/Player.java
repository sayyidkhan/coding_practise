package com.xaiver;

public class Player {

    public String fullName;
    public int health;
    public String weapon;
    // scope is currently used as public, it is supposed to be private

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
            // reduce number of lives for the player
        }

    }

    public int healthRemaining(){
        return this.health;
    }


}
