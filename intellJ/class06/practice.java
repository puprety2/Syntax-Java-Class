package com.syntax.intellJ.class06;

public class practice {
    public static void main(String[] args) {
        String word ="abrakadabra";

        String replace=word.replaceAll("[^aAeEiIoOuU]", " ");

        System.out.println(replace);
    }

}
