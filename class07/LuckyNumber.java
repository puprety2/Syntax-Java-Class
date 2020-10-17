package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		
		int numberFromUser;
		int luckyNumber=7;
		Scanner input=new Scanner(System.in);
		
		do {
			System.out.println("Please enter any number from range 1 to 100");
			numberFromUser=input.nextInt();
			
		}while(numberFromUser!=luckyNumber);
		
		System.out.println("You guess the number right!!");
		

	}

}
