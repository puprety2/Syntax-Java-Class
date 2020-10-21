package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int a=10;
		int[] num=new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		//to access element from array?
		
		System.out.println(num[2]);
		System.out.println(num[2]+num[4]);
		//i would like change 50 to 100
		num[4]=100;
		System.out.println(num[4]);
		String[] array=new String[2];
		array[0]="Hello";
		array[1]="Hi";
		array[2]="Namaste";
		array[3]="dhanyabad";
		
		System.out.println(array[1]);
	}

}
