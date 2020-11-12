package com.syntax.intellJ.class05;

public class Task2 {
    //method to return whether given number prime or not

    boolean isPrime(int number){
        boolean isPrime=true;
        for (int i = 2; i < number/2; i++) {
            if(number%1==0){
                isPrime=false;
                break;
            }

        }
        return isPrime;
    }


}
