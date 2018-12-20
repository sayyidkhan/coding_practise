package com.xaiver;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int newScore = calculateScore("Tim",500);
    System.out.println("New Score is " + newScore);
    System.out.println("\t");
    calculateScore(75); // using method overloading using the parameters score only
        calculateScore(); // using method overloading with no parameters
    }
    ////////////////// method overloading /////////////////////
    public static int calculateScore(String playerName,int score){
        System.out.println("Player " + playerName + "scored " + score + " points");
        return score * 1000;
    }
    /// creating a overloading method with just score
    public static int calculateScore(int score){
        System.out.println("unnamed player scored " + "scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("unnamed player scored " + "scored " + " points");
        return 0;
    }
    /*
    public static void calculateScore(){
        System.out.println("unnamed player scored " + "scored " + " points");
    }
    */
    //just changing the datatype doesnt make it an overloading method
    ////////////////// method overloading /////////////////////
}
