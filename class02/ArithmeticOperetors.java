package com.syntax.class02;

public class ArithmeticOperetors {

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1=10;
		num2=12;
		
		System.out.println(num1+num2);
		System.out.println(num2-num1);
		
		double num3=10.99;
		double num4=2.99;
		float nu=10.99f;
		float nu1=2.99f;
		System.out.println(nu/nu1);//3.6755853
		System.out.println("The result of the operation = "+nu/nu1);
		
		double mult=num3*num4;
		System.out.println(mult);
		double div=num3/num4;
		System.out.println(div);//3.6755852842809364
		
		int num5=7;
		int num6=3;
		int module=num5%num6;
		System.out.println(module);
		
	}
	
}
