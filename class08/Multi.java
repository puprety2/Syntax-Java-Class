package com.syntax.class08;

import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		Scanner input =new Scanner(System.in);
		System.out.println("Please enter number to find multiplication table?");
		int num = input.nextInt();
		System.out.println("Multiplication Table of "+num);
		System.out.println("");
		for(int i=1; i<=10; i++) {
		result=num*i;
		System.out.println(num+" x "+i+" = "+result);	
		}

	}

}
