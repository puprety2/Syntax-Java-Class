package com.syntax.class10;

public class ArrayTask {

	public static void main(String[] args) {
		String [] cars= {"Honda","Toyota","Ford","Tata","Jeep","Tesla"};
		for(int i=0; i<cars.length;i++) {
			System.out.print(cars[i]+" ");
		}
		System.out.println();
		System.out.println("getting values from array using enhanced for loop");
		
		for(String car:cars) {
			System.out.print(car+" ");
		}
		System.out.println();
		System.out.println("getting values from array using enhanced for loop");
		int[]numbers= {10,10,90,400,87};
		
		for(int num:numbers) {
			System.out.println(num);
		}
		
		System.out.println();
		System.out.println("getting values from array using enhanced for loop");
		
		boolean[] arrayOfBoolean= {true, true, false, true};
		for(boolean boo:arrayOfBoolean) {
			System.out.println(boo);
		}
		
	}

}
