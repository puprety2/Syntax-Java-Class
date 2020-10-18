package com.syntax.class08;

import java.util.Scanner;

public class TaskForLoop {

	public static void main(String[] args) {
		
		int isEven=0;
		int isOdd=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Provide start point?");
		int num1=input.nextInt();
		System.out.println("Provide end point?");
		int num2=input.nextInt();
		
		for (int i=num1;i<=num2; i++){
			if(i%2==0) {
				isEven+=i;
			}else {
				isOdd+=i;
			}
			
		}
		System.out.println("The sum of even number is: "+isEven);
		System.out.println("The sum of odd number is: "+isOdd);
		
		System.out.println("--------------------Task 2---------------------");
		
		int diff;
		int extra;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter product name?");
		String product=scan.next();
		
		System.out.println("Please enter price for that product?");
		int price=scan.nextInt();
		System.out.println("Please pay the money for that product?");
		int pay=scan.nextInt();
		
		while(price!=pay) {
			if(price>pay) {
				extra=price-pay;
				System.out.println("You need to pay $"+extra+" more");
			
			}else if(price<pay) {
				diff=pay-price;
				System.out.println("Your change is $"+diff);
				
			}
			break;
		}if(price==pay) {
		
		System.out.println("Thank you for shopping!!");
		}
	}

}
