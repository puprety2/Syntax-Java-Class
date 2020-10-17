package com.syntax.classTask;

import java.util.Scanner;

public class Large {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		double num3;
		double max = 0;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter First Number?");
		num1=input.nextInt();
		
		System.out.println("Enter Second Number?");
		num2=input.nextInt();
		
		System.out.println("Enter Third Number?");
		num3=input.nextInt();
		
		if(num1>num2) {
			if(num1>num3) {
				max=num1;
			}
		}else if(num2>num1) {
			if(num2>num3) {
				max=num2;
			}else {
				max=num3;
			}
		}
		
		System.out.println("The largest number is "+max);
	}

}

