package com.syntax.intellJ.class03;

public class Task2 {
    public static void main(String[] args) {
        String day="Sunday";
        if(day.isEmpty()){
            System.out.println("no string");
        }else{
            for(int i=day.length();i>0;i--){
                System.out.println(day.charAt(i));
            }
        }
    }
}
