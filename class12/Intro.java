package com.syntax.class12;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {

        int size=7;
        int d=1;
        Scanner input=new Scanner(System.in);
        String [] day=new String[size];
        for(int i=0;i<size;i++){
            System.out.println("Please enter "+d+" of the week");
            day[i]=input.next();
            d++;
        }
        for(int i=0;i<day.length;i++){
            System.out.println(day[i]);
        }


    }
}