package com.company;

public class Main {

    public static void main(String[] args) {
        // learning about operators
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result); // returns 3

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + "- 1 = " + result); // returns 2

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + "* 10 = " + result); // returns 20

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + "/ 5 = " + result); // returns 4

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + "% 3 = " + result); // returns 1

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result); // returns 2
        result++;
        System.out.println("Result is now " + result); // returns 3
        result--;
        System.out.println("Result is now " + result); // returns 2
        result += 2;
        System.out.println("Result is now " + result); // returns 4
        result *= 10;
        System.out.println("Result is now " + result); // returns 40
        result -= 10;
        System.out.println("Result is now " + result); // returns 30
        result /= 10;
        System.out.println("Result is now " + result); // returns 3

        byte isAlien = 2;
        if (isAlien == 1){
            System.out.println("It is not an alien.");
        }
        else if (isAlien == 2){
            System.out.println("It is an alien");
        }
        else{
            System.out.println("I dont know what type u are");
        }

        int topScore = 80;
        if (topScore >= 100){
            System.out.println("you got the top score");
        }

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100");
        }

        if(topScore > 81 || (secondTopScore <= 90)){
            System.out.println("one of these test is true");
        }

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("is car is false");

        isCar = true;
        //ternary operators
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

    }
}
