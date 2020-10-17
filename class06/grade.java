package com.syntax.class06;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		String msg;
		Scanner input=new Scanner(System.in);
		System.out.println("Please Enter your grade?");	
		char grade=input.next().charAt(0);
		
		switch(grade) {
		
		case'A':
			msg= "Excellent";
			break;
			
		case 'B':
			msg="Good";
			break;
		
		case 'C':
			msg="Average";
			break;
			
		case 'D':
			msg="Bad";
			break;
			
		default:
			msg="Not acceptable";
			
			
		}
			
		System.out.println("Your grade is "+grade+", Grade comment: "+msg);	
		

	}

}
