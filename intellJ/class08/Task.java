package com.syntax.intellJ.class08;

public class Task {
    /*
    Write a Student class that have instance variables name and address.
     Create a constructor that will initialize those variables.
     Print name & address of given  student using displayInfo method.
     */
    String name;
    String address;
    Task(String name,String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println("name "+name);
        System.out.println("Address "+address);
    }

    public static void main(String[] args) {
        Task studentA=new Task("Puskar","6670 roderick loop");
       studentA.displayInfo();
    }
}
