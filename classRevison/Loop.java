package com.syntax.classRevison;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		double result;
		char operation;
		String end;
		Scanner input=new Scanner(System.in);
		boolean continueLoop=true;
		while(continueLoop) {
			
		System.out.println("Please Enter two numbers");
		num1=input.nextDouble();
		num2=input.nextDouble();
		System.out.println("Please Enter the operation + - * /");
		operation=input.next().charAt(0);
		
		switch(operation) {
		
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;	
		default:
			result=0;
			
		}
		System.out.println("Results are "+result);	
		System.out.println("Enter Yes to perform more operations and No to terminate the program");
		end=input.next();
		if("No".equals(end)) {
			continueLoop=false;
		}
		}
		
	}

}
