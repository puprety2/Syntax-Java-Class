package com.syntax.classTask;

import java.util.Scanner;

public class CalculationNum {

	public static void main(String[] args) {
		double value=0;
		char perform;
		Scanner input = new Scanner(System.in);
		System.out.println("Pleanse Enter First Number?");
		double num1 = input.nextDouble();
		System.out.println("Please Enter Second Number?");
		double num2 = input.nextDouble();
		System.out.println("Please Enter Operators to Perform Arithmetic Operations( -, +, * ,/ )?");
		perform=input.next().charAt(0);
		
		
		
		switch(perform) {
		
		case '+':
			value=num1+num2;
			break;
		case '-':
			value=num1-num2;
			break;
		case '*':
			value=num1*num2;
			break;
		case '/':
			value=num1/num2;
			break;
		case '%':
			value=num1%num2;
			break;
		default:
			System.out.println("Please Enter valid Operators!!");
		}
	if (value!=0) {
		System.out.println("After performing "+num1+" "+perform+" "+num2+", We will get "+value);	
		
	}
	
	
	}

}


	