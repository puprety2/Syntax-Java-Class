package com.syntax.class08;

public class ForLoopTask {

	public static void main(String[] args) {
		System.out.println("---------Task 1-----------");
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		System.out.println("");
		System.out.println("---------Task 2-----------");
		for(int i=100;i>=1; i--) {
			System.out.print(i+ " ");
		}
		System.out.println("");
		System.out.println("---------Task 3-----------");
		
		for(int i=20;i>1; i-=2) {
			System.out.print(i+" ");
		}
		System.out.println("");
		for(int i=20; i>1;i--) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("");
		System.out.println("---------Task 4-----------");	
		for(int a=21;a<50; a+=2) {
			System.out.print(a+" ");
			}
		System.out.println("");
		for(int a=20; a<=50;a++) {
			if(a%2==1) {
				System.out.print(a+ " ");
			}
	      }
         
     }
}