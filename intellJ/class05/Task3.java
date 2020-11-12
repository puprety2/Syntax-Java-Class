package com.syntax.intellJ.class05;

public class Task3 {
    /*
    create class student that will have a method getGrade
    your method should accept the score of a student and return a grade
     */

    char getGrade(int marks){
        char grade;
        if (marks>90 && marks<=100){
            grade='A';

        }else if(marks>80 && marks<=90){
            grade='B';
        }else if(marks>=70 && marks<=80){
            grade='C';
        }else if(marks>60 && marks<70){
            grade='D';
        }else{
            grade='F';
        }
        return grade;
    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
        char result=task3.getGrade(101);
        System.out.println("Your grade is "+result);
    }
}
