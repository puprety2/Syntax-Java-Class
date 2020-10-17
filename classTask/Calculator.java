package com.syntax.classTask;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Double value;
		String perform;
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Operators to Perform Arithmetic Operations?");
		perform=input.nextLine();
		System.out.println("Please enter two distint numbers?");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		
		
		if(perform.equals("addition")) {
			value=num1+num2;
		}else if(perform.equals("subtraction")) {
			value=num1-num2;
		}else if(perform.equals("multiplication")) {
			value=num1*num2;
		}else if(perform.equals("division")) {
			value=num1/num2;
		}else {
			value=(double) 0;
		}
	System.out.println("After performing "+perform+ ", we will get "+value);	
	
	}

}
