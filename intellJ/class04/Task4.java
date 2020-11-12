package com.syntax.intellJ.class04;

public class Task4 {
    //crete a method that will say Hello in different language based on the country that will passed when method is executed

    static void sayHello(String countryName){
        switch(countryName){
            case "Nepal":
                System.out.println("Namaste");
                break;
            case "China":
                System.out.println("Ni hoa");
                break;
            case "Turkey":
                System.out.println("Merhaba");
                break;
            default:
                System.out.println("Country not supported");


        }
    }
}
