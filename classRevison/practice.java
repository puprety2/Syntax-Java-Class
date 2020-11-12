package com.syntax.classRevison;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        System.out.println(word.replaceAll("[^A,E,I,O,U,a,e,i,o,u]",""));

    }
}
