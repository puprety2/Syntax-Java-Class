package com.syntax.class12;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Maximum and minimum number in the array?

				int[] myArray = { 9, 66, -1, 45, 65, 32, 876, 0, -1};
				
				
				int max = myArray[0];
				int min = myArray[0];
				
				for (int i = 1; i < myArray.length; i++) {
					if (myArray[i] > max) {
						max = myArray[i];
					}
					if (myArray[i]< min) {
						min = myArray[i];
					}
				}
				
				System.out.println("the largest number in array is :" + max);
				System.out.println("the smallest number in array is :" + min);

		

	}

}
