package com.me;

import java.util.*;

public class SetMain {

    public static void main(String[] args) {

        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i = 1; i <= 100; i++){
            squares.add((int) Math.pow(i,2));
            cubes.add((int) Math.pow(i,3));
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes." );
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements.");

        System.out.println();

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("intersection contains " + intersection.size() + " elements.");

        System.out.println();

        System.out.println("Items in the intersection sets");
        System.out.println("------------------------------");
        for(int i : intersection){
            System.out.println(i + "is the square of " + Math.sqrt(i) + "and the cube of " + Math.cbrt(i));
        }

        System.out.println();

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for(String s: words){
            System.out.println(s);
        }

        System.out.println();
        // convert an array into a hashset to do math sets
        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] arrayNatureWords = {"all","nature","is","but","art","unknown","to","three"};
        nature.addAll(Arrays.asList(arrayNatureWords));

        String[] divineWords = {"to","err","is","human","to","forgive","divine"};
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("nature - divine: ");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine - nature: ");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);

        System.out.println("symmetric difference");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        //non-disruptive just check for membership
        if(nature.containsAll(divine)){
            System.out.println("divine is a subset of nature");
        }

        if(nature.containsAll(intersectionTest)){
            System.out.println("intersection is a subset of nature");
        }

        if(divine.containsAll(intersectionTest)){
            System.out.println("intersection is a subset of divine");
        }




    }

    public static void printSet(Set<String> set){
        System.out.println("\t");
        for(String s: set){
            System.out.println(s + " ");
        }
        System.out.println();
    }

    public static void printValue(Set value){
        Iterator<Integer> itr = value.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
