package com.syntax.intellJ.class06;

public class Main {
    public static void main(String[] args) {

        Employee employee=new Employee();
        employee.empId=1234;
        employee.salary=5000;
        Employee.CEO="Sumair";

        System.out.println(employee.empId);
        System.out.println(employee.salary);
        System.out.println(employee.CEO);

        Employee employee1=new Employee();
        employee1.empId=1342;
        employee1.salary=5500;



        System.out.println(employee1.empId);
        System.out.println(employee1.salary);
        System.out.println(employee1.CEO);


    Student student =new Student();
    student.studentID="pus123";
    student.studentName="Puskar";
    Student.numOfStudents++;

        System.out.println(student.studentID);
        System.out.println(student.studentName);
        System.out.println(Student.numOfStudents);

        Student student1 =new Student();
        student1.studentID="pu123";
        student1.studentName="Puskars";
        Student.numOfStudents++;

        System.out.println(student1.studentID);
        System.out.println(student1.studentName);
        System.out.println(Student.numOfStudents);

        Student student2 =new Student();
        student2.studentID="pus123";
        student2.studentName="Puskar";
        Student.numOfStudents++;

        System.out.println(student2.studentID);
        System.out.println(student2.studentName);
        System.out.println(Student.numOfStudents);






    }
}
