package com.xaiver;

public class getGreatestCommonDivisor {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));


        System.out.println(getGreatestCommonDivisor_for_loop(25,15));
    }

    public static int getGreatestCommonDivisor(int num1, int num2){

        if(num1 > num2){
            int placeholder = num1;
            num1 = num2;
            num2 = placeholder;
        }

        if(num1 >= 10){
            int remainder = 1;
            while(remainder != 0){
                remainder = num2 % num1;
                num2 = num1;
                num1 = remainder;
            }

            return num2;
        }
        return -1;

    }

    private static int getGreatestCommonDivisor_for_loop(int first, int second)
    {
        if(first<10 || second<10)
            return  -1;

        int gcd = 1;

        for(int i = 1; i<=first && i<=second;i++)
        {
            if (first % i == 0 && second % i == 0)
                gcd = i;

        }
        return gcd;
    }

}
