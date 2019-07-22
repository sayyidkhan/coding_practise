package com.me;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    // in lambdas there are 3 parts
    // 1st part - argument
    // 2nd part - arrow token
    // 3rd part - body

    public static void main(String[] args) {
        new Thread(() -> {
//            System.out.println("Printing from the Runnable");
//            System.out.println("Line 2");
//            System.out.println("This is line 3");
//            System.out.println("##############");
        }).start();


        Employee john = new Employee("John Doe",30);
        Employee tim = new Employee("Tim buchalka",21);
        Employee jack = new Employee("Jack Hill",40);
        Employee snow = new Employee("Snow White",22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

        Collections.sort(employees,(employee1, employee2) ->
                employee1.getName().compareTo(employee2.getName()));


        for(Employee employee : employees){
            System.out.println(employee.getName());
        }

    }


}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

