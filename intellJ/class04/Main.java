package com.syntax.intellJ.class04;

public class Main {
    public static void main(String[] args) {

        VoidMethods voidMethods=new VoidMethods();
        voidMethods.print();
        voidMethods.print(" Puskar");
        Task1.Oddeven(9);
        Task3 task3=new Task3();
        task3.isStringPalindrome("aba");
        task3.isStringPalindrome("eabaf");
        task3.isStringPalindrome("syntax");
        task3.isStringPalindrome("cacac");

        Task4.sayHello("Nepal");
        Temp.print();

    }


}
