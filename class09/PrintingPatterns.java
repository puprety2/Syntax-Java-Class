package com.syntax.class09;

public class PrintingPatterns {

	public static void main(String[] args) {
		
		for(int r=1;r<=4;r++) {
			
			for(int c=1; c<=6;c++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("Big Square");
		for(int a=1;a<=6;a++) {
			for(int b=1;b<12;b++) {
				System.out.print("||");
			}
			System.out.println();
		}
		System.out.println("Square of the number");
		for (int d=1; d<=7;d++) {
			for(int co=3; co<=10;co++) {
				System.out.print(d);
				
			}
			System.out.println();
		}
	}

}
