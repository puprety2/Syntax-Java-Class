package com.syntax.class06;

import java.util.Scanner;

public class NotOperator {
	public static void main(String[] args) {
		
		boolean b=!true;
		System.out.println(b);
		
		boolean anotherBoolean=!false;
		System.out.println("anotherBoolean");
		
		System.out.println("-------------------------------------------------------------------");
		
		boolean isCold=false;
		
		if(!isCold) {
			System.out.println("I am going to the beach.");
		}
		
		System.out.println("-------------------------------------------------------------------");
		
		int num1, num2, num3;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter first Number?");
		num1=input.nextInt();
		System.out.println("Enter second Number?");
		num2=input.nextInt();
		System.out.println("Enter third Number?");
		num3=input.nextInt();
		
		if(num1!=num2 && num2!=num3) {
			if(num1>num2 && num1>num3) {
				System.out.println("The largest number is "+num1);
			}else if(num2>num3) {
				System.out.println("The Largest number is "+num2);
			}else {
				System.out.println("The Largest number is "+num3);
			}
		}else {
			System.out.println("The Numbers are equal!!");
		}
		
		System.out.println("------------------------------------------------------------------");
		
	}

}
