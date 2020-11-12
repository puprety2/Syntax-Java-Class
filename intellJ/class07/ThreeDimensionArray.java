package com.syntax.intellJ.class07;

import java.util.Scanner;

public class ThreeDimensionArray {
    public static void main(String[] args) {
        String [][][] array3d= new String[2][2][3];
        Scanner input=new Scanner(System.in);

        for(int i=0;i< array3d.length;i++){
            for(int j=0;j<array3d[i].length;j++){
                for(int k=0;k<array3d[i][j].length;k++){
                    System.out.println("Please enter a name:");
                    array3d[i][j][k]=input.nextLine();

                }
            }
        }
        for(String [][] array2d:array3d){
            for(String [] array1d:array2d){
                for(String array:array1d){
                    System.out.print(array+" ");

                }
                System.out.println();
            }
            System.out.println();

        }

    }
}
