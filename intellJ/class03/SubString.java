package com.syntax.intellJ.class03;

public class SubString {
    public static void main(String[] args) {
        String name = "love has no value unless it is shared";
        System.out.println(name.substring(5));// first 5 characters will be ignored
        System.out.println(name.substring(1));

        //System.out.println(name.substring(-1)); //Error

        System.out.println(name.substring(5,7));
        System.out.println(name.substring(5,7)+name.substring(5,7));
    }
}