package com.syntax.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("---------------Task 2---------------------");
		Scanner input = new Scanner(System.in);
		System.out.println("Please apply for the credit card>");
		String isAsking=input.nextLine();
		while(isAsking.equals("false")) {
			
			System.out.println("Please apply for the credit card>");
			isAsking=input.nextLine();
			if(isAsking.equals("true")) {
				break;
			}
		}
		

	}

}
