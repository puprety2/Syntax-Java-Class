package com.syntax.classTask;

import java.util.Scanner;

public class country {

	public static void main(String[] args) {

		String language;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your country?");
		String country = input.nextLine();

		switch (country) {

			case "Japan":
				language = "Japanese";
				break;
			case "India":
				language = "Hindi";
				break;
			case "Nepal":
				language = "Nepali";
				break;
			case "United States":
				language = "English";
				break;
			default:
				language = "Unknown";
		}

		System.out.println("In "+country+" people are speaking " + language+" language.");

	}

}
