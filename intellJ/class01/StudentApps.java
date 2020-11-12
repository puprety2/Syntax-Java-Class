package com.syntax.intellJ.class01;

public class StudentApps {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="Puskar";
        student.Class=12;
        student.grade='A';
        student.gpa=4.5;

        student.scored(89);

    }
}
