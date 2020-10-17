package com.syntax.class05;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Do you have credit card");
		Boolean creditCard=input.nextBoolean();
		if(creditCard) {
			System.out.println("How much balance you have:");
			int bal=input.nextInt();
			if(bal>1000) {
				System.out.println("Pay off immediately");
				
			}else {
				System.out.println("You can spend more!!");
			}
		}else {
			System.out.println("You can apply for credit card");
		}

	}

}
