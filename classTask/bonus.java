package com.syntax.classTask;

import java.util.Scanner;

public class bonus {

	public static void main(String[] args) {
		
		int year, salary;
		Scanner input;
		input=new Scanner(System.in);
		
		System.out.println("Please Enter Numbers of Worked Years?");
		year=input.nextInt();
		System.out.println("Please Enter Annual Salary?");
		salary=input.nextInt();
		
		if(year>5) {
			if(salary>50000) {
				System.out.println("The bonus is 5000");
			}else {
				System.out.println("The bonus is 3000");
			}
		}else {
			System.out.println("Not eligible for the bonus");
		}

	}

}
