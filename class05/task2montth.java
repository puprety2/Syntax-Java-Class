package com.syntax.class05;

import java.util.Scanner;

public class task2montth {

	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		 
		 System.out.println("Please enter your Birth Month");
		 String month=input.nextLine();
		 String season;
		 if(month.equals("June") || month.equals("July") || month.equals("August")) {
			 season="Summer";
		 }else if(month.equals("September") || month.equals("October") || month.equals("November")) {
			 season="Fall";
		 }else if(month.equals("December") || month.equals("January") || month.equals("Febrauary")) {
			 season="Winter";
		 }else if(month.equals("March") || month.equals("April") || month.equals("May")) {
			 season="Spring";
		 }else {
			 season="Invalid month!!";
		 }
		 
		 System.out.println("You were born on "+season);
		 if(season.equals("Summer")) {
			 System.out.println("You are lucky!!");
		 }else if(season.equals("Fall")) {
			 System.out.println("You are God Child!!");
		 }else if(season.equals("Winter")) {
			 System.out.println("You are cold as Snow!!");
		 }else if(season.equals("Spring")) {
			 System.out.println("You are like Spring flowers!!");
		 }
	}

}
