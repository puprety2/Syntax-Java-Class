package com.syntax.class08;

import java.util.Scanner;

public class Price {

	public static void main(String[] args) {
		
		double sum=0;
		double diff=0;
		double extra=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter name and price of the product you are buying? ");
		String name=input.next();
		double price=input.nextDouble();
		for(double i=price; i<=price; i++) {
			sum+=i;
			System.out.println("Total Amount is "+sum+" . Do you want to continue shopping (yes or no)?");
			String decision=input.nextLine();
			
			if(decision.equals("yes")) {
				System.out.println("Total Amount is "+sum+" . Do you want to continue shopping (yes or no)?");
				 decision=input.nextLine();
				 //sum+=i;		
			}else {
				System.out.println("Please make a payment");
				double pay=input.nextDouble();
				if(price<pay) {
					diff=price-pay;
					System.out.println("You need have $"+diff);
				}else {
					extra=pay-price;
					System.out.println("Your change is $"+extra);
				}	
			}
		System.out.println("Thank you for shopping!!");	
		}
		
	}

}
