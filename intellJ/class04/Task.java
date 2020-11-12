package com.syntax.intellJ.class04;

public class Task {
    public static void main(String[] args) {
        //prints large number using method
        System.out.println("The largest number is "+max(21,20));
    }
    public static int max(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
