package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {
		
		
		boolean isDiploma=true;
		float gpa=3.5f;
		
		if (isDiploma) {
			System.out.println("Congratulation");
			
			if (gpa>=3.5) {
				System.out.println("You are eligible for scholarship!");
			}else {
				System.out.println("You should have studied harder!!");
			}
			
		}else {
			System.out.println("Get a degree!");
		}
		System.out.println("------------------Exercise 2------------------------");
		
		float morgageRate=4.0f;
		long morgagePrice=200000;
		
		if (morgageRate>4.5) {
			System.out.println("We will not buy the house!!");
		}else {
			if (morgagePrice>200000) {
				System.out.println("We will take a loan!!");
			}else {
				System.out.println("We will pay cash!!");
			}
		}
	}

} 
