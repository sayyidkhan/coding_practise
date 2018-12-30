package com.xaiver;

public class DiagonalStar_CleanSolution {
    // write your code here
    public static void main(String[] args) {
        printSquareStar(8);
    }


    public static void printSquareStar(int number) {

        if (number < 5) {

            System.out.println("Invalid Value");

        } else {

            for (int column = 1; column <= number; column++) {
                for (int row = 1; row <= number; row++) {
                    if (column == 1 || column == number || row == 1 || row == number) {
                        System.out.print("*");
                    } else if (column == row || column == number - row + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }


        }

    }


}