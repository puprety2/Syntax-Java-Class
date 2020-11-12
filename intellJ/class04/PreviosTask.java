package com.syntax.intellJ.class04;

public class PreviosTask {
    public static void main(String[] args) {

        //write a program to reverse the contents of a string

        String str1="Anna";
        String reverse="";
        for (int i = str1.length()-1; i >=0 ; i--) {
            System.out.print(i+ " ");
            reverse+=str1.charAt(i);
            System.out.println();
            System.out.print(reverse+" ");

        }
        System.out.println(reverse);
        System.out.println("Is "+ str1+" palindrome? "+ reverse.equalsIgnoreCase(str1));
        System.out.println("--------Second way------------");

        StringBuilder stringBuilder=new StringBuilder("Anna");
        System.out.println(stringBuilder.reverse());
    }
}
