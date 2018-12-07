package com.xaiver;

public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    // write your code here
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        else{
            long hour = minutes / 60;
            long days = (hour / 24) % 365;
            long years = (hour/24) / 365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
