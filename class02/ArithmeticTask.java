package com.syntax.class02;

public class ArithmeticTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y;
		double a, b;
		x=10;
		y=2;
		a=6.60;
		b=2.30;
		
		int add=x+y;
		int sub=x-y;
		double mult=a*b;
		double div=a/b;
		System.out.println("The addition of 2 number 10 and 2 is equal to "+add);
		System.out.println("The substraction of 2 number 10 and 2 is equal to "+sub);
		System.out.println("The multiplication of 2 number 6.60and 2.30 is equal to "+mult);
		System.out.println("The division of 2 number 6.60 and 2.30 is equal to "+div);
		
		double sq1=3.9;
		double square=sq1*sq1;
		System.out.println("The square of the 3.9 is "+square);
		
		int w=5;
		int h=8;
		int peri=2 *(w+h);
		int area=w*h;
		System.out.println("The perimeter of a rectangle with width 5 and height 8 equal to "+peri+" and the area is "+area);
		
				
	}

}
