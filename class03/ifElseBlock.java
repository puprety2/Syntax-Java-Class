package com.syntax.class03;

public class ifElseBlock {
 
	public static void main (String [] args) {
		
		double money=5;
		double iceCream=4.59;
		
		if(iceCream<=money) {
			
			System.out.print("i am buying Ice Cream.");
			System.out.println(" I would like vanilla flavor.");
		}
		else {
			System.out.println("Need Extra money to buy");
		}

		System.out.println("I am code that executes without any condition.");
	}
}
