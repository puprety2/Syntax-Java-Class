package com.syntax.class08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		int waterPrice=5;
		Scanner input=new Scanner(System.in);
		System.out.println("Please pay for your water?");
		int waterPay=input.nextInt();
		
		while(waterPay!=waterPrice) {
			if(waterPay>waterPrice) {
				System.out.println("Please pay $" +(waterPay-waterPrice)+" less money!!");
			}else {
				System.out.println("Please pay $" +(waterPrice-waterPay)+" more money!!");
				
			}
			
			System.out.println("Please pay for your water?");
			waterPay=input.nextInt();
		}
		System.out.println("Enjoy your water!!");
		
		System.out.println("-------------do while loop----------------");
		
		System.out.println("Please pay for your water?");
		int waterPays;
		
		do {
			waterPays=input.nextInt();
			if(waterPay>waterPrice) {
				System.out.println("This is too much, please pay less money");
			}else {
				System.out.println("Water is expensive, please pay more money");
				
			}
			
			
		}while(waterPays!=waterPrice);
		
		System.out.println("Enjoy your water!!");
		
		
	}

}
