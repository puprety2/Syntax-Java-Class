package com.syntax.intellJ.class02;

public class StringMethods {
    public static void main(String[] args) {

        //Two different way of declare string
        String string="Hello";
        String string1=new String("HelloWorld");
        System.out.println(string+" - "+string1);

        //length which returns length of the string
        String name="Puskar Raj Uprety";
        int length=name.length();
        System.out.println(length);
        System.out.println(name.length());

        if(name.length()>10){
            System.out.println("you are great !!");
        }

    }

}
