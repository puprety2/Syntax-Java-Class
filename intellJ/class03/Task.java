package com.syntax.intellJ.class03;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String momName, dadName, gender,babyName;

        System.out.println("Mom's first name?");
        momName=input.next();
        System.out.println("Dad's first name?");
        dadName=input.next();
        System.out.println("Is it a boy or girl?");
         gender=input.next();

         if(gender.toLowerCase().startsWith("b")) {
             String firstPart = dadName.substring(0, dadName.length() / 2);
             String secondPart = momName.substring(momName.length() / 2);
             babyName = firstPart + secondPart;
             //babyName=((dadName.substring(0, dadName.length()/2))+(momName.substring(momName.length()/2)));
         }
         else if(gender.toLowerCase().startsWith("g")) {
             String firstPart = momName.substring(0, momName.length() / 2);
             String secondPart = dadName.substring(dadName.length() / 2);
             babyName = firstPart+ secondPart;

         }else{
             babyName="No suggestion";

         }
        System.out.println(babyName);
    }
}
