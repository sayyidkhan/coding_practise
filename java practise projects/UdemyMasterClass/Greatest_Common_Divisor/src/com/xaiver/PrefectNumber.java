package com.xaiver;

public class PrefectNumber {

    public static void main(String[] args) {
//        System.out.println(isPerfectNumber(-1));
//        System.out.println(isPerfectNumber(6));
//        System.out.println(isPerfectNumber(28));
//        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(0));
    }

    public static boolean isPerfectNumber(int num) {

        int counter = num - 1;
        int sum = 0;
        if(!(num < 2)){

            while(counter != 0){
                if(num % counter == 0){
                sum += counter;
                }
                counter--;
            }
        }
        boolean validateZero = (num == 0) ? false : true;
        boolean state = (num == sum) ? validateZero : false;

        return state;
    }

}
