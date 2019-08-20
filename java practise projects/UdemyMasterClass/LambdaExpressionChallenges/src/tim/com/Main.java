package tim.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

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

        System.out.println("#############");

        // challenge 6 - ans
        Supplier<String> iLoveJava = () -> "I love Java!";

        // challenge 7 - ans
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

        // challenge 9
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        System.out.println("################");

        //challenge 9
        List<String> firstUpperCaseList = topNames2015.stream().map(name -> name.substring(0, 1).toUpperCase() + name.substring(1)).sorted(String::compareTo).collect(Collectors.toList());
        firstUpperCaseList.forEach(s -> System.out.println(s));

    }

    // challenge 5
    public static String everySecondChar(Function<String,String> func,String source){
        return func.apply(source);
    }

}
