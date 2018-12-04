package com.xaiver;

public class BarkingDog {
    public static void main(String[] args) {
        Boolean result = bark(true,0);
        System.out.println(result);
    }

    public static boolean bark(boolean barking, int hourOfTheDay) {
        boolean finalValue = false;
        if ((hourOfTheDay >= 0 && hourOfTheDay < 8) || (hourOfTheDay > 22 && hourOfTheDay <= 23)){
            if(barking == true) {
                finalValue = true;
            }
        }

        return finalValue;
    }
}
