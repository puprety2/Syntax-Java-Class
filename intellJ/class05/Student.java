package com.syntax.intellJ.class05;

public class Student {
    String name;//instance variable
    int age;
    double marks;
    int numOfStudentEnrolled=10;
    public void printInfo(){
        System.out.println("Name "+name+" Age "+age+" Marks "+marks);
    }
    public void printMarks(){
        System.out.println("Marks "+marks);
    }
}
