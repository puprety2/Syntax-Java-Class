package com.syntax.class03;

public class IfStatement {

	public static void main (String [] args) {
		
		int num1=1800;
		int num2=900;
		
		
		System.out.println("Writing my first if statement");
		
		if (num1>num2) {
			System.out.println("Num1 is bigger than num2.");
		}
		
		else {
			
			System.out.println("Num1 is not bigger than num2");
		}
		
		System.out.println("End of if statement.");
		
		
		System.out.println("............................................................................");
		
		
		int temp=70;
		
		if(temp>80) {
			System.out.println("I am going to the beach!!");
			
		}
		
		else {
			
			System.out.println("I am going to date!!");
		}
		
		System.out.println("............................................................................");
		
		double expectedHours=15;
		double actualHours=20;
		
		if (actualHours>expectedHours) {
			
			System.out.println("You will love the course and you will be succeed");	
		}
		else {
			System.out.println("Course will be too hard for you!!");	
		}
			
		

	}
}
