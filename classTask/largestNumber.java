package com.syntax.classTask;

import java.util.Scanner;

public class largestNumber {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter First number?");
		int num1=input.nextInt();
		
		System.out.println("Enter Second number?");
		int num2=input.nextInt();
		
		System.out.println("Enter Three number?");
		int num3=input.nextInt();
		
		
		if(num1>num2 && num1>num3) {
			System.out.println("The largest number is "+num1);
		}else if(num2>num1 && num2>num3) {
			System.out.println("The largest number is "+num2);
		}else {
			System.out.println("The largest number is "+num3);
		}

	}

}
