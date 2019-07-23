package com.me;

import java.util.ArrayList;
import java.util.List;

public class Lambda_ForLoop {

    public static void main(String[] args) {

        List numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.forEach(number -> {
            int number_A = (int) number * 2;
            System.out.println(number_A);
        });

        for(Object number : numbers){
            int number_A = (int) number * 2;
            System.out.println(number_A);
        }


    }

}
