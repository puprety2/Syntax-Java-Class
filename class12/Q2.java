package com.syntax.class12;

public class Q2 {

	public static void main(String[] args) {
		
		/*
		 * Write a Java Program to print the first 10 numbers of Fibonacci series.
		 */
		
		int a = 0;
		int b = 1;
		int sum;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(a+" ");
			sum = a + b;
			//System.out.print(sum+" ");
			
			a = b;
			b = sum;
		}


	}

}
