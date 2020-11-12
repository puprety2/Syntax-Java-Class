package com.syntax.intellJ.class04;

public class Task3 {
    //create a method that will print whether given string is palindrome or not
    public void isStringPalindrome(String string){
        int i=0;
        int j=string.length()-1;
        while(i<j){
            if(string.charAt(i)!=string.charAt(j)){
                System.out.println("String is not palindrome");
                return;
            }
            i++;
            j--;

        }
        System.out.println("String is a palindrome");
    }
}
