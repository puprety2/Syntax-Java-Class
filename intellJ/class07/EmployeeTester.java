package com.syntax.intellJ.class07;

public class EmployeeTester {
    public static void main(String[] args) {
        Employees employee=new Employees();
        employee.age=67;
        employee.name="Puskar";
        employee.grade='A';
        System.out.println(employee.age);

        Employees employees=new Employees(34,"puskar",'A');
        System.out.println(employees.age);

    }
}
