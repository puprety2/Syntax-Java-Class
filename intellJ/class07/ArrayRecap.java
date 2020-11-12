package com.syntax.intellJ.class07;

public class ArrayRecap {
    public static void main(String[] args) {
        int [] intArr={3,4,5,6,54};
        int[][] intArray=new int[2][3];
        intArray[0][0]=23;
        intArray[0][1]=22;
        intArray[0][2]=33;

        intArray[1][0]=43;
        intArray[1][1]=43;
        intArray[1][2]=13;

        int sum=0;

        for(int i=0; i<intArray.length;i++){
            for(int j=0; j<intArray[i].length; j++){
                sum=sum+intArray[i][j];

            }
        }
        System.out.println(sum);
        System.out.println("---------------different way-----------------------");
        int sum1=0;
        for(int[] row:intArray){
            for (int value:row) {
                sum1=sum1+value;
            }

        }
        System.out.println(sum1);
    }
}
