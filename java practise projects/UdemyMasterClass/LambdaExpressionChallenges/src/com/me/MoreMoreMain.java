package com.me;

import java.util.Arrays;
import java.util.List;

public class MoreMoreMain {

    public static void main(String[] args) {

        // challenge 12
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

        // challenge 13 - the reason why peek does not work
        // the chain does not contain a terminal operation.
        // the stream chains are evaluated lazily. nothing happened until a terminal operations is
        // added to the chain. At the point, the chain is executed.
        topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .toArray();


    }


}
