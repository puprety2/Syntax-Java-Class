package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) { //print numbers except 3
			if(i==3 || i==7) {
				continue;
			}
			System.out.println(i);
			
		}
		System.out.println("End of the loop");

	}

}
