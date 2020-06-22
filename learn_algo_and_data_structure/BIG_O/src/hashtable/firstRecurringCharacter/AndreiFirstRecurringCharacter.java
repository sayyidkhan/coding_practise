package hashtable.firstRecurringCharacter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AndreiFirstRecurringCharacter {

    public static void main(String[] args) {
        int[] listA = {2,5,1,2,3,5,1,2,4};
        int[] listB = {2,1,1,2,3,5,1,2,4};
        int[] listC = {2,3,4,5};
        int[] listD = {2,5,5,2,3,5,1,2,4};

        System.out.println(firstRecurring(listD));
    }

    //iterate using double for loops
    private static Integer firstRecurring(int[] intA){
        ArrayList<Integer> myArrayList = new ArrayList<>();
        for(int i = 0;i < intA.length;i++){
            Integer key = intA[i];
            //if have first recurring return
            if(myArrayList.get(key) != null){
                return key;
            }
            //if dont have add into list
            else{
                myArrayList.add(key);
            }
        }
        return null;
    }

    //iterate using hashtable solution
    private static Integer firstRecurring2(int[] intA){
        HashMap<Integer,Integer> myHashMap = new HashMap<>();
        for(int i = 0;i < intA.length;i++){
            Integer key = intA[i];
            if(myHashMap.get(key) != null){
                return key;
            }
            else{
                myHashMap.put(key,i);
            }
            System.out.println(myHashMap);
        }
        return null;
    }

}
