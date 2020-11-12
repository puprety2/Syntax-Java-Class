package com.syntax.intellJ.class03;

public class Task1 {
    public static void main(String[] args) {
        String name="strings";
        int length=name.length();
        if(name.isEmpty()){
            System.out.println("No string available");
        }else{
           if(length>3 && length%2!=0){
               System.out.println(name.charAt(length/2));
            }
        }
    }
}
