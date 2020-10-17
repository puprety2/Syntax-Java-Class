package com.syntax.class07;

public class WhileMoreExamples {

	public static void main(String[] args) {
		
		String day="Saturday";
		while(day.equals("Saturday")) {
			System.out.println("Lovely day!!");
			day="Sunday";
		}
		boolean isItMorning=true;
		while(isItMorning) {
			System.out.println("I will get breakfast");
			isItMorning=false;
		}
	}

}
