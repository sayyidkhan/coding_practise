package com.xaiver;

public class IntEqualityPrinter {
    public static void main(String[] args) {
    printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
        printEqual(2,1,1);
    }

    public static void printEqual(int value_1,int value_2,int value_3) {

        if(value_1 <0 || value_2 < 0 || value_3 <0){
            System.out.println("Invalid Value");
        }
        else if(value_1 == value_2 && value_1 == value_3){
            System.out.println("All numbers are equal");
        }
        else if(value_1 != value_2 && value_1 != value_3 && value_2 != value_3){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }
    }

}

