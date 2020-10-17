package com.syntax.classTask;

import java.util.Scanner;

public class largestNested {

	public static void main(String[] args) {
		
		double num1, num2, num3, big = 0;
	    Scanner input;
	    
	    input=new Scanner(System.in);
	    System.out.println("Enter First number?");
	    num1=input.nextDouble();
	    
	    System.out.println("Enter Second number?");
	    num2=input.nextDouble();
	    
	    System.out.println("Enter Third number?");
	    num3=input.nextDouble();
		
	    if(num1>num2) {
	    	if(num1>num3) {
	    		big=num1;
	    	}else {
	    		big=num3;
	    	}
	    }else {
	    	if(num2>num1) {
	    		if(num2>num3) {
	    			big=num2;
	    		}else {
	    			big=num3;
	    		}
	    	}
	    }
		
	    System.out.println("The Largest number is "+big);
	    
	}
}