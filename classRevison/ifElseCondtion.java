package com.syntax.classRevison;

public class ifElseCondtion {

	public static void main(String[] args) {
		
		int a=0;
		System.out.println("Line before if conditon");
		if (a>0) {
			System.out.println("Number is greater than zero");
		}else {
		System.out.println("line after if condition");
		}
		System.out.println("This will be printer always");
		
		System.out.println("..............................................................");
		System.out.println("this will be printed always");
		if (a>0) {
			System.out.println("Number is grater than zero");
		}else if(a<0) {
			System.out.println("Number is  greater less than zero");
			
		}else {
			System.out.println("Number is zero");
		}
		System.out.println("This will be printed");
	}

}
