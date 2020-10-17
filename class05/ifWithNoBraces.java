package com.syntax.class05;

public class ifWithNoBraces {

	public static void main(String[] args) {
		
		boolean isSaturday=true;
		if(isSaturday) 
			System.out.println("Today is a Java class");//if no braces only 1 line will be treated as code for if block
			
			System.out.println("Today is not Saturday");//this code does not belong to the if statement because no braces
				
		System.out.println("And tomorrow i will have a java class");
		
		System.out.println("I am a code outside of if statement");

	}

}