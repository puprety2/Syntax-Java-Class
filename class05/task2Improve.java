package com.syntax.class05;

import java.util.Scanner;

public class task2Improve {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		

		System.out.println("Please enter your Quiz");
		double Q=input.nextDouble();
		System.out.println("Please enter your Midterm");
		double M=input.nextDouble();
		System.out.println("Please enter your Final");
		double F=input.nextDouble();
		
		double Score= (Q+M+F)/3;
		char grade;
		
		System.out.println(Score);
		if(Score>=90) {
			grade='A';
		}else if(Score>=70 && Score<90) {
			grade='B';
		}else if(Score>=50 && Score<70) {
			grade='C';
		}else if(Score>=40 && Score<50) {
			grade='D';
		}else {
			grade='F';
		}
		System.out.println("Grade is= "+grade);
		if(grade=='A' || grade=='B') {
			System.out.println("You are good student");
		}else {
			System.out.println("You need to study Hard!!");
		}
	}
}