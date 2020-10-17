package com.syntax.class05;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your Quiz");
		double q=input.nextDouble();
		System.out.println("Please enter your Midterm");
		double m=input.nextDouble();
		System.out.println("Please enter your Final");
		double f=input.nextDouble();
		
		double score= (q+m+f)/3;
		
		if (score>=90) {
			System.out.println(score+" Grade A");
		}else if(score>=70 && score<90) {
			System.out.println(score+" Grade B");
		}else if(score>=50 && score<70) {
			System.out.println(score+" Grade C");
		}else {
			System.out.println(score+" 34Grade F");
		}
		
		System.out.println("------------------second------------------");
		System.out.println("Please enter season");
		int day=input.nextInt();
		
		if(day>=5 && day<=7) {
			System.out.println("You were born Summer.");
		}else if(day>=8 && day<=11) {
			System.out.println("You were born Winter");
		}else if (day>=1 && day<=5) {
			System.out.println("You were born Spring");
		}else {
			System.out.println("Invalid input");
		}
		System.out.println("-------------------------------------solve grade with extra info-------------------------------");
		
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
			System.out.println("You need to study More!!");
		}
	}
}
		
		
