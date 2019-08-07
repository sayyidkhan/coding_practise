package tim.com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // challenge 1
//        Runnable task = () -> {
//            String myString = "Let's split this up into an array";
//            String[] parts = myString.split(" ");
//            for(String part:parts){
//                System.out.println(part);
//            }
//        };

        // challenge 2
        Function<String,String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                if(i % 2 == 1){
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        // challenge 3 - ans
        System.out.println(lambdaFunction.apply("1234567890"));



    }

    // challenge 5
    public static String everySecondChar(Function<String,String> func,String source){
        return func.apply(source);
    }

}
