package com.xaiver;

public class LargestPrime_CleanSolution {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(16));
        System.out.println();
    }

    public static int getLargestPrime(int number){

        if(number < 2){
            return -1;
        }

        int count = 2;

        while(number > 1){
                if (number % count == 0) {
                    number /= count;
                }
                else{
                    count++;
            }

        }
        return count;
    }

}

