package com.me;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

//        String data1 = "Searching in words : java javap myjava myjavaprogram";
//
//        String regex = "(\\w+)";
//
//        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher(data1);
//        while (matcher.find())
//        {
//            System.out.print("Start index: " + matcher.start());
//            System.out.print(" End index: " + matcher.end() + " ");
//            System.out.println(matcher.group());
//        }

        // Challenge 1
        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));

        System.out.println();

        // Challenge 2
        String regEXp = "I want a \\w+."; // . matches any character
        String challenge2 = "I want a ball.";
        String regExp1 =  "I want a (bike|ball).";
        System.out.println();
        System.out.println(challenge1.matches(regExp1));
        System.out.println(challenge2.matches(regExp1));

        System.out.println();

        // Challenge 3
        String regExp3 = "I want a \\w+";
        Pattern pattern = Pattern.compile(regExp3);
        System.out.println("Challenge 1 : " + pattern.matcher(challenge1).matches());
        System.out.println("Challenge 2 : " + pattern.matcher(challenge2).matches());

        System.out.println();

        // Challenge 4
        String challenge4 = "Replace all blanks with underscores.";
        String regExp4 = "\\s";
        String challenge4Solution = challenge4.replaceAll(regExp4,"_");
        System.out.println("Challenge 4: " + challenge4Solution );

        // Challenge 5
        String challenge5 = "aaabccccccccdddefffg";
        String regExp5 = "\\w*";
        System.out.println("Challenge 5 " + challenge5.matches(regExp5));

        System.out.println();

        // Challenge 6
        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));

        // challenge 7
        String challenge7 = "abcd.135";
        String challenge7_1 = "kjisl.22";
        String challenge7_2 = "f5.12a";
        String regExp6 = "^([a-zA-Z]+?).([0-9]+)";
        System.out.println("Challenge 7: " + challenge7.matches(regExp6));
        System.out.println("Challenge 7_1: " + challenge7_1.matches(regExp6));
        System.out.println("Challenge 7_2: " + challenge7_2.matches(regExp6)); // should return false

        // challenge 8
        String challenge8 = "abcd.135uvqz.7tzik.999";
        String regExp7 = "(\\d+)(\\d{1,3})";
        Pattern pattern2 = Pattern.compile(regExp7);
        Matcher matcher2 = pattern2.matcher(challenge8);

        int count = 0;
        while(matcher2.find()){
            count++;
            System.out.println("count : " + count + ", value: " + matcher2.group(0));
        }



    }
}
