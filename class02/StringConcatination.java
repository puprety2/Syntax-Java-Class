package com.syntax.class02;

public class StringConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Olga";
		//I would like to say: My name is Olga
		 System.out.println("My name is "+name);
		 
		 String Lname="Sorrels";
		 System.out.println(name+ " "+Lname);

		 String city="Gainesville";
		  System.out.println(name+" lives in "+city);
		  char grade='A';
		  
		  System.out.println(name+" is "+grade+" student");
		  int age=21;
		  System.out.println(name+" is "+age+" year old");
		  
		  /* 
		   * to attach/concatenate ANY value(char, int, String, double) 
		   * to a String we use + (string concatenation operator)
		   */
		  int date=27;// 
		  String month="september";
		  System.out.println(date+" "+month);
		  
		  String state="DC";
		  String anotherState="   DC ";
		  //above String are not equal
		  System.out.println(state+anotherState);
}
	
}
