package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		
		//lets ask user how many names he would like to store and then stores those name
		Scanner input=new Scanner(System.in);
		String [] names;
		int size;
		System.out.println("How many names you would like to stores");
		size=input.nextInt();
		
		names=new String[size];
		
		for(int i=0; i<size;i++) {
			System.out.println("Please enter any name?");
			names[i]=input.next();
			
		}
		for(int i=0; i<names.length;i++) {
			System.out.print(names[i]+" ");
		}
		

	}

}
