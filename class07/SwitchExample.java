package com.syntax.class07;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the day?");
		String day=input.nextLine();
		
		switch(day) {
		case "monday":
		case "friday":
			System.out.println("We do not have class !!");
			break;
		case "tuesday":
		case "wednesday":
			System.out.println("We have Git Class!!");
			break;	
		case "thursday":
			System.out.println("We have Revision Class !!");
			break;	
		case "saturday":
		case "sunday":
			System.out.println("We have JAVA Class!!");
			break;
		default:
			System.out.println("Invalid input!!");
		}

	}

}
// Do not do this way