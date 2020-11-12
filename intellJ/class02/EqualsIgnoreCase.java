package com.syntax.intellJ.class02;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String name="PuSkar";
        String name1="puskar";
        System.out.println(name.equalsIgnoreCase(name1));
        System.out.println(name1.equalsIgnoreCase(name));
    }
}
