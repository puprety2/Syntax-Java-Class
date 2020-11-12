package com.syntax.intellJ.class07;

public class ConstructorsWithAccessLevel {
    /*
    Write a program  that will have 4 different access levels of constructors and create 3 objects of this class:
    1 - inside same class;
    2 - from outside the class;
     3 - from different class inside different package  and observe result.
     */

    String name;
    int age;
    double salary;
    private ConstructorsWithAccessLevel(String name){
        this.name=name;
    }
    ConstructorsWithAccessLevel(int age){
        this.age=age;
    }
    public ConstructorsWithAccessLevel(double salary){
        this.salary=salary;
    }

    public static void main(String[] args) {
        ConstructorsWithAccessLevel task1= new ConstructorsWithAccessLevel("Puskar");
        System.out.println(task1.name);

        ConstructorsWithAccessLevel task2= new ConstructorsWithAccessLevel(30);
        System.out.println(task2.age);

        ConstructorsWithAccessLevel task3= new ConstructorsWithAccessLevel(30000.00);
        System.out.println(task3.salary);
    }
}
