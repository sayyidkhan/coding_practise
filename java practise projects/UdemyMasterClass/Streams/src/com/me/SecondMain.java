package com.me;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondMain {

    public static void main(String[] args) {

        Employee john = new Employee("John Doe", 30);
        Employee jane = new Employee("Jane Deer", 25);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        Department hr = new Department("Human Resources");
        hr.addEmployee(jane);
        hr.addEmployee(jack);
        hr.addEmployee(snow);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(john);

        // an arraylist of arraylists
        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);


        Map<Integer, List<Employee>> groupedByAge = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));

        System.out.println("----------------------");
        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1,e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);

        System.out.println("----------------------");
        // nothing happens until there is a terminal operation - that is how a stream works
        Stream.of("ABC", "AC", "BAA", "CCCC", "XY", "ST")
                .filter(s -> {
                    System.out.println(s);
                    return s.length() == 3;
                });

        System.out.println("----------------------");
        // count is a terminal operations
        Stream.of("ABC", "AC", "BAA", "CCCC", "XY", "ST")
                .filter(s -> {
                    System.out.println(s);
                    return s.length() == 3;
                })
                .count();


    }

}
