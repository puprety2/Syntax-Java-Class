package com.syntax.intellJ.class07;

public class RecapTask1 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.Method should be available
    to all classes within you project and accessible by class name.
     */
    public static StringBuilder reverseString(String string){
        StringBuilder stringBuilder=new StringBuilder(string);
        return stringBuilder.reverse();
    }

}
