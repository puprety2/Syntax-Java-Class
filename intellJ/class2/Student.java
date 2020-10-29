package com.syntax.intellJ.class2;

public class Student {

    String name;
    int Class;
    char grade;
    double gpa;

    void scored (double score) {
        if (score > 90) {
            System.out.println("Your grade is A");
        }else if(score<=90 && score>80){
            System.out.println("Your grade is B");
        }else{
            System.out.println("Your grade is C");
        }

    }
}

