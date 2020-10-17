package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input;
		int number;
		
		input=new Scanner(System.in);
		System.out.println("Please enter any number");
		number=input.nextInt();
		
		if(number>0 && number<=10) {
			System.out.println("You entered small number");
		}else if(number>10 && number<=100) {
			System.out.println("You entered medium number");
		}else if(number>100 && number<=1000) {
			System.out.println("You entered large number");
		}else {
			System.out.println("Invalid input");
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		String day="Satuarday";
		
		if(day.equals("Satuarday") || day.equals("Sunday") ) {
			System.out.println("Today i have a Java class at Syntax");
		}
		System.out.println("The End");
		System.out.println("...........................More Examples........................................");	
		
		System.out.println("Please enter todays day using numbers only (1 to7)");
		int numdays=input.nextInt();
		
		if(numdays==1 || numdays==5) {
			System.out.println("I am off from Syntax");
		}else if(numdays==2 || numdays==3) {
			System.out.println("GIT clases");
		}else if(numdays==4) {
			System.out.println("Review Class");
		}else if(numdays==6 || numdays==7) {
			System.out.println("Java class");
		}else {
			System.out.println("Everything else will be invalid day");
		}
	}

}
