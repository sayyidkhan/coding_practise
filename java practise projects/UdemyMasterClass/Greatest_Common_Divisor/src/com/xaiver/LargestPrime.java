package com.xaiver;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int num) {

        int largestPrime = -1;

        // to handle all even equations
        while (num % 2 == 0){
            largestPrime = 2;
            num /= 2;
        }

        // to handle all odd equations
        // count the number up to 21 to validate all prime numbers
        for( int counter = 3 ; counter < (int)(Math.sqrt(num) + 1) ; counter+=2 ){
            // to validate whether is it divisble by prime numbers
            if(num % counter == 0){
                largestPrime = counter;
                num /= counter;
            }
        }

        // to declare the largest prime as the final result
        if(num > 2){
            largestPrime = num;
        }

        return largestPrime;

    }

}
