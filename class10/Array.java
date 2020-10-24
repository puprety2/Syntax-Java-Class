package com.syntax.class10;

public class Array {

	public static void main(String[] args) {
		
		int avg;
		int[] grade=new int[5];
		grade[0]=98;
		grade[1]=80;
		grade[2]=89;
		grade[3]=67;
		grade[4]=77;
		avg=(grade[0]+grade[1]+grade[2]+grade[3]+grade[4])/5;
		
		System.out.println("The average student of five people "+avg);
		
		double [] array;
		array=new double[3];
		array[0]=12.99;
		array[1]=10.89;
		
		System.out.println(array[2]);
		
		array[2]=5.99;
		System.out.println(array[2]);
		
		String [] input=new String[4];
		input [0]="computer";
		input [1]="speaker";
		input [2]="hard drive";
		input [3]="phones";
		
		System.out.println(input[0]);
		
	}

}
