package com.syntax.intellJ.class07;

public class Employees {
     int age;
     String name;
     char grade;

    Employees(){
        System.out.println("I will be called everytime you create an object of this class");
    }
    Employees(int ageValue,String nameValue, char gradeValue){
        System.out.println("I am not a useless constructor i am initializing you fields");
        if(ageValue>60 || ageValue<18){
            System.out.println("You should not working please retire or wait to be 18 years old");
        }else{
            age=ageValue;
        }
        if(name.length()>25){
            System.out.println("Please use shor name like Aladin");
        }else{
            name=nameValue;
            grade=gradeValue;
        }

    }
     void print(){
        System.out.println("Number "+age+" name "+name+" character "+grade);
    }



}
