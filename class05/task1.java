package com.syntax.class05;

import java.util.Scanner;

public class task1 {
 public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	 System.out.println("Please enter heights in inches");
	 int height=input.nextInt();
	 if(height<60) {
		 System.out.println("short height");
	 }else if(height>=60 && height<=72) {
		 System.out.println("You have medium height");
	 }else {
		 System.out.println("You are taller ");
	 }
	 System.out.println("---------------task2----------------------");
	 
	 System.out.println("Please enter days from 1 to 7 ");
	 int day=input.nextInt();
	 if(day>=1 && day<=5 ) {
		 System.out.println("It is a weekday");
	 }else if(day==6 || day==7) {
		 System.out.println("It is a weekend");
	 }else {
		 System.out.println("Invalid day");
	 }
 }
}
