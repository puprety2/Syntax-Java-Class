package com.syntax.class05;

import java.util.Scanner;

public class recapClass {

	public static void main(String[] args) {
		
		Scanner scanner;
		System.out.println("Plesae enter any sentence");
		scanner =new Scanner(System.in);
		String sentence=scanner.nextLine();
		
		System.out.println("You entered sentence: "+sentence);
		
		System.out.println("Please enter sigle character");
		 char singleCharacter=scanner.next().charAt(0);
		 System.out.println("you enter single character: "+singleCharacter);
	}
	

}
