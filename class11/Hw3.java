package com.syntax.class11;

public class Hw3 {

	public static void main(String[] args) {
		
		String [] countries= {"Nepal","Bhutan","India"};
		String capital;
		for(String country:countries) {
			
			switch (country) {
			
			case "Nepal":
				capital="Kathmandu";
				break;
			case "Bhutan":
				capital="Thimpu";
				break;
			case "India":
				capital="Delhi";
				break;
			default:
				capital="N/A";
				
			}
			System.out.println("The capital of "+country+" is "+capital);
			
		}


	}

}
