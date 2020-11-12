package com.syntax.intellJ.class07;

public class Task1 {
    /*
    Write a program that will have a constructor:
    one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
    int age;
    int year;
    int month;
    int dat;
    String name;
    char grade;
    Task1(){
        System.out.println("i am empty constructor");
    }
    Task1(int ageValue,char gradeValue){
        age=ageValue;
        grade=gradeValue;
    }
    Task1(int ageValue, String nameValue, char gradeValue){
        age=ageValue;
        name=nameValue;
        grade=gradeValue;
    }
    public static void main(String[] args) {
        Task1 task1=new Task1(30,"Puskar",'B');
        Task1 task2=new Task1(34,'H');
        Task1 task3=new Task1();
    }
}
