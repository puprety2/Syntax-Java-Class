package com.syntax.class10;

public class Revision {

	public static void main(String[] args) {
		boolean condition= true;
		while(condition) {
			System.out.println("I am while loop");
		
			for(int i=1; i<=8;i++) {
				System.out.println("i am for loop");
				
			}
			condition=false;
		}
		System.out.println("----------------------------------------------");
		boolean conditions=true;
		for(int i=1;i<=3;i++) {
			System.out.println("I am for loop");
			while(conditions) {
				System.out.println("I a while loop");
				break;
			}
					
		}
		

	}

}
