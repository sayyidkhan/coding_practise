package com.xaiver;

public class FactorPrinter {

    public static void main(String[] args) {
        printFactors(10);
    }

    public static void printFactors(int num) {

        if (num < 1){
            System.out.println("Invalid Value");
        }
        else {
            for (int counter = 1; counter <= num; counter++) {
                if (num % counter == 0) {
                    System.out.println(counter);
                }
            }
        }
    }

}
