package com.syntax.intellJ.class01;

public class smartPhone {
    String color;
    String brand;
    String model;
    String name;

    void dial(long phoneNumber){
        System.out.println("calling "+phoneNumber);
    }
    void text(String text){
        System.out.println(name+" texting you from "+brand +" "+ model+" "+text);
    }
    void pics(){
        System.out.println(brand+ " is taking picture");
    }

}
