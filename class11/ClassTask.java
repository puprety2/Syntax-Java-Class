package com.syntax.class11;

public class ClassTask {

	public static void main(String[] args) {
		
		//I would like to find largest number from the array?
		int [] array= {77, 0, 20, 8, -1, 10, 56};
		
		int largest=array[0];
		for(int i=1; i<array.length; i++) {
			if(array[i]>largest) {
				largest=array[i];
				
			}	
			
		}
	System.out.println("The largest number is "+largest);
		
		

	}

}
