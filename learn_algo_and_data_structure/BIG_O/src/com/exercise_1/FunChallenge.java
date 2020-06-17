package com.exercise_1;

public class FunChallenge {

    public static void main(String[] args) {
        int[] intArray = {0,1};
        funChallenge(intArray);
    }

    private static int funChallenge(int[] input){
        int a = 10; // O(1) -> constant time, only runs once
        a = 50 + 3; // O(1)

        // loops are linear time
        for(int i = 0;i < input.length;i++){ // O(input) -> O(n)
            anotherFunction(); // o(n)
            boolean stranger = true; // o(n)
            a++; // o(n) -> it depends how many times it runs
        }
        return a; // O(1), the result only runs once
    }

    /* sum of all the steps:
    BIG O(3) + BIG O(N) * 4 = BIG O(3 + 4*n )
    can be simplified to
    BIG O(n)
    *
    */

    private static int anotherFunction(){
        return 0;
    }



}
