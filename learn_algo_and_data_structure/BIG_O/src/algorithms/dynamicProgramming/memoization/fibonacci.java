package algorithms.dynamicProgramming.memoization;

import java.util.HashMap;
import java.util.function.Function;

public class fibonacci {

    public static void main(String[] args) {
        System.out.println(memoizedFib(10));
    }

    private static int memoizedFib(int integer){
        System.out.println("calculating fibonacci: " + integer);
        MyInt counter = new MyInt(0);
        int result = lambdaMemoizedFib(counter,null,integer);
        System.out.println("max iterations: " + counter.getInteger());
        return result;
    }

    private static int lambdaMemoizedFib(MyInt counter,HashMap<Integer,Integer> hashMap,int integer){
        //1. if dont have hashmap create hashmap
        hashMap = (hashMap == null) ? new HashMap<>() : hashMap;
        //2. reassign final variable, because lambda interfaces, prefer to access final variable
        final HashMap<Integer, Integer> finalHashMap = hashMap;
        //3. get value from key
        Function<Integer,Integer> getCache = finalHashMap::get;
        //4. value is here
        Integer value = getCache.apply(integer);
        //5. check if value exist
        if(value != null){
            return value;
        }
        else{
            if(integer < 2){
                return integer;
            }
            else{
                //6. otherwise calculate
                Integer valueToStore =
                        lambdaMemoizedFib(counter,finalHashMap,integer - 1)
                        + lambdaMemoizedFib(counter,finalHashMap,integer - 2);
                counter.setInteger(counter.getInteger() + 1);
                //7. once calculated, store the value for future use
                finalHashMap.put(integer,valueToStore);
                return valueToStore;
            }
        }
    }

}

class MyInt{
    private int integer;

    public MyInt(int integer) {
        this.integer = integer;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }
}