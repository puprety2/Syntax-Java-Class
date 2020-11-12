package com.syntax.intellJ.class07;

public class RecapTask {
    /*
    Create a method that will accept an array as parameters and will return a sum of elements from that array.
    method should be visibly only within same package and accessible by the creating an instance of the class.
     */

    double sumArray(double [] array){

        double sum=0;
        for(int i=0;i<array.length-1;i++){
            sum=sum+array[i];
        }
        return sum;
    }
}
