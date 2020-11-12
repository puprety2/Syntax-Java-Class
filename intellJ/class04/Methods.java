package com.syntax.intellJ.class04;

public class Methods {
    public static void main(String[] args) {
        System.out.println("Your addition result is : "+addNumbers(25,15));
        System.out.println("Your addition result is : "+addNumbers(32,58));
        System.out.println("Your addition result is : "+addNumbers(28,18));

    }
    public static int addNumbers(int num1, int num2){
        return num1+num2;
    }
}

