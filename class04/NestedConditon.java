package com.syntax.class04;

public class NestedConditon {

	public static void main(String[] args) {
		
		boolean allergy=false;
		boolean petAllergy=false;
		boolean peanutAllergy=true;
		boolean pollenAllergy=false;
		
		if(allergy) {
			System.out.println("Lets do further check");
			if(petAllergy) {
				System.out.println("Please no pets at home.");
			}else {
				System.out.println("That is good you do not have pet allergy");
			}
			
			
			
			
		}else {
			System.out.println("You are lucky!!");
		}
		

		System.out.println("---------------------Example 2-----------------------");
		
		boolean isFriday=false;
		int date=14 ;
		boolean monday=false;
		
		if (isFriday) {
			if (date==13) {
				System.out.println("I will watch scary movie.");
			}else {
				System.out.println("I will watch PK movie with Amir Khan");
			}
			
			}else {
				if (monday) {
					System.out.println("I am not studying, I am working");
				}else {
					System.out.println("I have class at Syntax");
				}
			}
		
		System.out.println("---------------------Example 3-----------------------");    
		
		 boolean isAssignment=true;
		 int score=90;
		 
		 if (isAssignment) {
			 if (score>=90) {
				 System.out.println("Great Job!!");
			 }else if (score>=80) {
				 System.out.println("Good Job!!");
			 }else if(score>=70){
				 System.out.println("Probably you need to study more!!");
			 }else {
				 System.out.println("Good job for trying but you must study!");
			 }
		
		 }else {
			 System.out.println("You have not done Assignment");
		 }
		 
		 
	}

}
