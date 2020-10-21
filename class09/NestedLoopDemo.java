package com.syntax.class09;

public class NestedLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=10;i<=14;i++) {
			
			
			for(int j=1; j<=4; j++) {
				
				System.out.println(i+" AND "+j);
			}
			
		}
		System.out.println("---------------------------------------------");
		for(int i=1; i<4;i++) {
			System.out.println("Hello");
			for (int j=1; j<3;j++) {
				System.out.println("everyone");
			}
			System.out.println("......................");
		}
		System.out.println("---------------------------------------------");
		
		for(int i=1; i<=9; i++) {
			for(int j=0; j<=9;j++) {
				System.out.print(i+""+j+" ");
			}
		}
	}

}
