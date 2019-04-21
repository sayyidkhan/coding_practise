package practise.binarysearch;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        int[] intArr = {10,20,15,22,35};
        int intKey = 22;

        // binarySearch(intArr,intKey); // 1.428ms search time
        bruteSearch(intArr,intKey); // 1.44 ms search time
    }

    public static void bruteSearch(int[] list, int key){
        for(Integer item : list){
            System.out.println('.');
            if(item == key){
                System.out.println("key found: " + key);
                return;
            }
        }
        System.out.println("Key not found.");
    }

    public static void binarySearch(int[] list, int key){
        int status = Arrays.binarySearch(list,key);
        if(status >= 0){
            System.out.println("key found: " + key);
        }
        else{
            System.out.println("Key not found.");
        }
    }

}
