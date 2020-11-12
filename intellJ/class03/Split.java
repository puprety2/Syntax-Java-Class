package com.syntax.intellJ.class03;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {

        String name="Puskar*Uprety";
        String [] array=name.split("[^A-Z a-z]");
        for(String names:array){
            System.out.println(names);

        }
        System.out.println(Arrays.toString(array));
    }
}
