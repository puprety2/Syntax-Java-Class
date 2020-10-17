package com.syntax.classRevison;

import java.util.Scanner;

public class gender {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your gender: M or F");
		String gender = input.next();
		System.out.print("Please enter your age ");
		int age = input.nextInt();

		if (age > 25) {
			if (gender == "F") {
				System.out.println("Woman");
			} else {
				System.out.println("Man");
			}
		} else {
			if (gender == "F") {
				System.out.println("Girl");
			} else {
				System.out.println("Boy");
			}
		}

	}
}
