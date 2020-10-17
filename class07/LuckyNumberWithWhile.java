package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumberWithWhile {

	public static void main(String[] args) {
		
		int luckyNum=10;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the number between 1 to 100");
		int num=input.nextInt();
		
		while(num!=luckyNum) {
			System.out.println("Please enter number between 1 to 100");
			num=input.nextInt();
			
		}
		System.out.println("You guess the right number!!");

	}

}
