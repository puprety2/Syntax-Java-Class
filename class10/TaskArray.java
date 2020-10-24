package com.syntax.class10;

public class TaskArray {

	public static void main(String[] args) {
		char [] grades=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		System.out.println("grade "+grades[1]);
		
		char[] grade= {'A','B','C','D','E','F'};
		System.out.println("grade "+grade[1]);
		System.out.println("------------Next------------------------");
		
		String [] name=new String[3];
		name[0]="tom";
		name[1]="harry";
		name[2]="sam";
		System.out.println("he is "+name[1]);
		
		String[] names= {"tom","harry","sam"};
		System.out.println("he is "+name[2]);
		
		System.out.println("------------Next------------------------");
		
		String [] words=new String[5];
		words[0]="Java";
		words[1]="Saturday";
		words[2]="day";
		words[3]="coding";
		words[4]="is";		
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		String [] word= {"Java","Saturday","day","coding","is"};
		System.out.println(word[1]+" "+word[4]+" "+word[0]+" "+word[3]+" "+word[2]);
		
		for(int i=0; i<name.length;i++) {
			System.out.println(name[i]);
		}
	}

}
