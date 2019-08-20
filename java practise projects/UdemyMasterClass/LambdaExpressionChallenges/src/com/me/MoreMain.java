package com.me;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoreMain {

    public static void main(String[] args) {

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

        List<String> newTopNames2015 = topNames2015.stream()
                    .map(s -> s.toUpperCase().charAt(0) + s.substring(1))
                    .sorted()
                    .collect(Collectors.toList());

        newTopNames2015.forEach(s -> System.out.println(s));

    }

}
