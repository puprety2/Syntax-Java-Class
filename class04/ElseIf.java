package com.syntax.class04;

public class ElseIf {

	public static void main(String[] args) {
		
		int num1=199;
		int num2=99;
		
		if(num1>num2) {
			System.out.println(num1+" is bigger than "+num2);
		}else if(num1<num2) {
			System.out.println(num1+" is smaller than "+num2);
		}else {
			System.out.println(num1+" is equal to "+num2);
		}
		
		System.out.println(".........................................................................");
		
		int day=30;
		
		if(day==1) {
			System.out.println("Today is Monday we have no class.");
		}else if(day==2) {
			System.out.println("Today is Tuesday we have manual class.");
		}else if(day==3) {
			System.out.println("Today is Wednesday we have manual class.");
		}else if(day==4) {
			System.out.println("Today is Thursday we have revision class.");
		}else if(day==5) {
			System.out.println("Today is Friday we have no class.");
		}else if(day==6) {
			System.out.println("Today is Saturday, i miss Java classes.");
		}else if(day==7) {
			System.out.println("Today is Sunday, I did a lot of coding.");
		}else {
			System.out.println("This is invalid day of a week, please provide valid day from 1 to 7 !!");
		}
	}
}
