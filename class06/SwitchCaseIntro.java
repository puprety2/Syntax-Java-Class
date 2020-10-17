package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseIntro {

	public static void main(String[] args) {
		String today;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter a Day Number?");
		int day=scan.nextInt();
		
		switch(day) {
		case 1:
			today="Monday";
			break;
		case 2:
			today="Tuesday";
			break;
		case 3:
			today="Wednesday";
			break;
		case 4:
			today="Thursday";
			break;
		case 5:
			today="Friday";
			break;
		case 6:
			today="Saturday";
			break;
		case 7:
			today="Sunday";
			break;
			
		default:
			today="Invalid Day";
		
		}	
		
		System.out.println("Today is "+today+".");
		//break; ---> is optional since it is a last statement in the switch block
	}

}
