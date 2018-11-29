package com.company;

public class Operator_Main {

    public static void main(String[] args) {

        // 1. Create a double variable with the value 20
        // 2. create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply to 25
        // 4. use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        // if the remaining total (#4) is equal to 20 or less.

        double value_1 = 20;
        double value_2 = 80;
        double value_3 = (value_1 + value_2) * 25;
        System.out.println("value_3:" + value_3);
        double value_4 = value_3 % 40;
        System.out.println("value_4:" + value_4);
        if (value_4 <= 20)
            System.out.println("Total was over the limit");

    }

}
