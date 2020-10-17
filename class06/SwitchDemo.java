package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		String msg;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a browser?");
		String browser=input.nextLine();
		
		switch(browser.toLowerCase()) {
		
		case "safari":
			msg="Your code will be executed on Safari Browser.";
			break;
		case "chome":	
			msg="Your code will be executed on Google Chrome.";
			break;
		case "firefox":
			msg="Your code will be executed on Firefox.";
			break;
		default:
			msg="Entered browser is not supported.";
		}
		 
		System.out.println(msg);
		
		//switch case cannot use relational or logical operators
		//switch cannot work with double, float, and long
		//switch cannot work with boolean
	}

}
