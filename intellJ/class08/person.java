package com.syntax.intellJ.class08;

public class person {
    String name;
    String address;
    int age;
    String phone;
    String SSN;
    char gender;
    char martialStatus;
    double height;
    double weight;
    int numberOfKids;
    double salary;
    String education;

    person()
    {
        System.out.println("This is important");
        System.out.println("This is important");
    }
    person(String name, int age, String phone,double salary, char martialStatus,int numberOfKids){
        this();
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.salary=salary;
        this.martialStatus=martialStatus;
        this.numberOfKids=numberOfKids;
        System.out.println("i am the first constructor i only have 6 fields as mandatory");

    }
    person(String name, int age, String phone,double salary, char martialStatus,int numberOfKids, String education){

        this(name,age,phone,salary,martialStatus,numberOfKids);
        this.education=education;
        System.out.println("i am the first constructor i only have 7 fields as mandatory");

    }
    person(String name, int age, String phone,double salary, char martialStatus,int numberOfKids, String education,double height,double weight){

        this(name,age,phone,salary,martialStatus,numberOfKids,education);
        this.height=height;
        this.weight=weight;
        System.out.println("i am the first constructor i only have 9 fields as mandatory");

    }

    public static void main(String[] args) {
        person person1=new person("puskar",34,"788-888-7677",34000.00,'n',5);
        System.out.println(person1.address);
    }
}
