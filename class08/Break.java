package com.syntax.class08;

public class Break {

	public static void main(String[] args) {
		
		for(int i=1; i<4; i++) {
			System.out.println("Hello");
			break;
		}
		
		for(int i=1; i<=10; i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
			
		}
	}

}
