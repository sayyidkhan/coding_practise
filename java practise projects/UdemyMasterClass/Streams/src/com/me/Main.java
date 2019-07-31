package com.me;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	    List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71");



	    List<String> gNumbers = new ArrayList<>();

//	    someBingoNumbers.forEach(number -> {
//	        if(number.toUpperCase().startsWith("G")){
//	            gNumbers.add(number);
////                System.out.println(number);
//            }
//        });
//
//	    gNumbers.sort((String s1,String s2) -> s1.compareTo(s2));
//	    gNumbers.forEach((String s) ->System.out.println(s));

        someBingoNumbers
                .stream()
                .map(String::toUpperCase) // :: is called a method expression
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

        Stream<String> ioNumberStream = Stream.of("I26","I17","I29","071");
        Stream<String> inNumberStream = Stream.of("N40","N36","I26");
        Stream<String> concatStream = Stream.concat(ioNumberStream,inNumberStream);
        System.out.println("-----------------------------");//
        System.out.println(concatStream
                .distinct()
                .peek(System.out::println) // pekk is usually used for debuging
                .count());

        System.out.println("------------------------");
        List<String> sortedGNumbers = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add,ArrayList::addAll);




    }


}
