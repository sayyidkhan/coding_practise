package hashtable.firstRecurringCharacter;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class FirstRecurringCharacter {

    public static void main(String[] args) {
        int[] listA = {2,5,1,2,3,5,1,2,4};
        int[] listB = {2,1,1,2,3,5,1,2,4};
        int[] listC = {2,3,4,5};

        System.out.println("list A");
        firstRecurring(listA);
        System.out.println("list B");
        firstRecurring(listB);
        System.out.println("list C");
        firstRecurring(listC);

    }

    private static void firstR(int[] intArray){
        int myFirstCounter = 0;
        int myfirstInt = intArray[myFirstCounter];
        int mySecondInt;

        for(int i = 1;i < intArray.length;i++){
            mySecondInt = intArray[i];
        }
    }

    private static void firstRecurring(int[] intArray){
        if(intArray.length < 2){
            return;
        }
        Hashtable<Integer,Integer> myHashTable = new Hashtable<>();
        for(int i = 0;i < intArray.length;i++){
            int counter = 0;
            for(int j = 1;j < intArray.length;j++){
                int firstNumber = intArray[i];
                int secondNumber = intArray[j];
                if(firstNumber == secondNumber){
                    myHashTable.put(firstNumber,counter);
                    counter++;
                }
            }
        }

        // what if it is a 2,2,1,1
        int shortestDistance = 0;
        Set<Map.Entry<Integer,Integer>> entrySet = myHashTable.entrySet();
        for(Map.Entry<Integer,Integer> integer : entrySet){
            Integer value = integer.getValue();
            if(value > shortestDistance){
                shortestDistance = value;
            }
        }



        System.out.println("undefined");
    }

}
