package com.syntax.class04;

public class Task1 {
	public static void main(String[] args) {
		
		int month=19;
		
		if (month==1) {
			System.out.println("January");
		}else if(month==2) {
			System.out.println("February");
		}else if(month==3) {
			System.out.println("March");
		}else if(month==4) {
			System.out.println("April");
		}else if(month==5) {
			System.out.println("May");
		}else if(month==6) {
			System.out.println("Jun");
		}else if(month==7) {
			System.out.println("July");
		}else if(month==8) {
			System.out.println("August");
		}else if(month==9) {
			System.out.println("September");
		}else if(month==10) {
			System.out.println("October");
		}else if(month==11) {
			System.out.println("November");
		}else if(month==12) {
			System.out.println("December");
		}else {
			System.out.println("Invalid input, please enter between 1 to 12.");
		}
		System.out.println("---------------------------------");
		
		int num =0;
		
		if (num>0) {
			System.out.println("The number is positive.");
		}else if(num<0) {
			System.out.println("The number is Negative.");
		}else {
			System.out.println("Given number is zero.");
		}
		System.out.println("---------------------------------");
		
		int x=5;
		int y = x%2;
		
		if(y==0) {
			System.out.println("Give number is even.");
		}else {
			System.out.println("The given number is odd");
		}
	}
 
}
