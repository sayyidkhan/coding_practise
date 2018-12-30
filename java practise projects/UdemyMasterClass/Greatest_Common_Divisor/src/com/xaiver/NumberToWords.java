package com.xaiver;

public class NumberToWords {

    public static void main(String[] args) {
        // getDigitCount
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-1));
        // reverse
        System.out.println(reverse(10));
        // numberToWords
        numberToWords(10);
    }

    public static int getDigitCount(int num) {
        int value = Integer.toString(num).length();
        if(num < 0){
        return -1;
        }
        return value;
    }

    public static int reverse(int num) {
        int reverseValue = 0;

        while(num != 0){
            int lastDigit = num % 10;
            reverseValue = reverseValue * 10 + lastDigit;
            num /= 10;
        }

        return reverseValue;
    }

    public static void numberToWords(int num) {
        int numLength = getDigitCount(num); // 3
        int value = reverse(num); // 321
        String StringArray[] = new String[]{"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        for(int counter = 0;counter < numLength;counter++){
            int printNum = value % 10;
            value /= 10;
            System.out.println(StringArray[printNum]);
        }
        if(num < 1)
            System.out.println("Invalid Value");
    }

}
