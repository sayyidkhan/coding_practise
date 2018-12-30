package com.xaiver;

public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(8);

    }

    public static void printSquareStar(int num) {

        if (num >= 5) {
            for (int rows = 0; rows < num; rows++) {

                // prints the zero and the last mainCounter
                if (rows == 0 || rows == (num - 1)) {
                    for (int columns = 0; columns < num; columns++) {
                        System.out.print('*');
                    }
//                    if (rows == 0) {
//                        System.out.println("");
//                    }
                }
                // prints the zero and the last mainCounter

                // prints the first and the second last mainCounter
                else if (rows == 1 || rows == (num - 2)) {
                    for (int columns = 0; columns < num; columns++) {
                        if(columns == 0 || columns == 1 || columns == num - 1 || columns == num -2) {
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
                // prints the zero and the second last mainCounter

                else {
                    for (int column = 0; column < num; column++) {
                        if (column == 0 || column == (num - 1)) {
                            System.out.print("*");
                        } else if (rows == column || rows == num - (column + 1)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }

            }
        }
        else{
            System.out.println("Invalid Value");
        }
    }


}
