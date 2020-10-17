package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int num=1;
		while(num<=1) {
			
			System.out.println("Please Enter Your Name?");
			String name=input.nextLine();
			System.out.println("Nice to meet you "+name);
			System.out.println("............"+num+"............");
			num++;
		}
			
		System.out.println("------------do while loop................");
	
	}

}
