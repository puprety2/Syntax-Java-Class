package com.syntax.class07;

public class Recap {

	public static void main(String[] args) {
		
		String timeOfDay ="Noon";
		String day="Saturday";
		
		switch(timeOfDay) {
		case "Morning":
			System.out.print("Good Morning");
			
			if (day.equals("Saturday")) {
				System.out.println(" Class");
			}
			break;
		case "Noon":
			System.out.print("Good Afternoon!!");

			if (day.equals("Saturday")) {
				System.out.println(" to All!!");
			}	
			break;	
		case "Evening":
			System.out.print("Good Evening");
			
			if (day.equals("Saturday")) {
				System.out.println(" Folks!!");
			}	
			break;
		default:
			System.out.println("N/A");
			
		}

	}

}
