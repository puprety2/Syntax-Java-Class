package com.syntax.intellJ.class02;

public class Equals {
    public static void main(String[] args) {
        String name="Prakriti pathak";
        System.out.println(name.equals("pathak"));
        System.out.println(name.equals("Prakriti pathak"));
        System.out.println();
        String names=new String("Prakriti pathak");
        System.out.println(name.equals(names));
    }
}
