package com.syntax.intellJ.class05;

public class Main {
    public static void main(String[] args) {
        Task1 task1=new Task1();
        String email=task1.createEmail("puskar","uprety","gmail");
        System.out.println(email);

        Task2 task2=new Task2();
         boolean prime=task2.isPrime(25);
        boolean prime1=task2.isPrime(3);
        boolean prime2=task2.isPrime(67);
        System.out.println(prime);
        System.out.println(prime1);
        System.out.println(prime2);

        Variables variables=new Variables();
        variables.varsDemo();
        variables.varsDemo1(5);

        Student puskar=new Student();
        puskar.name="Puskar";
        puskar.age=30;
        puskar.marks=89;
        puskar.numOfStudentEnrolled=12;

        Student puskar1=new Student();
        puskar1.name="Puskar";
        puskar1.age=30;
        puskar1.marks=89;

        System.out.println(puskar1.numOfStudentEnrolled);

    }
}
