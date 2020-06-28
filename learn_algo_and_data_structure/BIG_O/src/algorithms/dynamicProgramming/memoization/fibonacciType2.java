package algorithms.dynamicProgramming.memoization;

import java.util.ArrayList;

public class fibonacciType2 {

    public static void main(String[] args) {
        fibonacciType2(15);
    }

    //bottom up solution
    private static void fibonacciType2(int integer){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);

        for(int i = 2;i <= integer;i++){
            int value = arrayList.get(i - 1) + arrayList.get(i - 2);
            arrayList.add(value);
        }

        Integer result = arrayList.get(integer);
        System.out.println("result: " + result);
    }

}
