package com.syntax.class07;

public class WhileCondition {

	public static void main(String[] args) {
		
		System.out.println("Printing numbers 1 to 50..........");
		int num1=1;
		
		while(num1<=50) {
			System.out.print(num1+" ");
			
			num1++;
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Printing from 10 to 30 only even --");

		 int num=10;
			while(num<=30) {
				if(num%2==0) {
					System.out.print(num+" ");
					
				}
				num++;
			}
			System.out.println("");
			System.out.println("");
		System.out.println("Printing from 100 to 1 only odd --");
		
		 int num2=100;
		 	while(num2>=1) {
		 		if(num2%2==1) {
		 			System.out.print(num2+" ");
					
		 			}
				
		 		num2--;
		 	}	
		 	
		 	
	}
}