package com.arrays;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] sortA = {0,3,4,31};
        int[] sortB = {4,6,30};

        int[] sortedList = sortedList(sortA,sortB);
        System.out.println(Arrays.toString(sortedList));
    }

    private static int[] sortedList(int[] a,int[] b){
        int aLength = a.length; //O(1)
        int bLength = b.length; //O(1)
        int[] sortedInt = new int[aLength + bLength];
        System.arraycopy(a,0,sortedInt,0,aLength); //O(n)
        System.arraycopy(b,0,sortedInt,aLength,bLength); //O(n)

        // sorted is O(1)
        Arrays.sort(sortedInt);
        return sortedInt;

    }

}
