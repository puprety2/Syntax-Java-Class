package com.syntax.class12;

public class SumOf2DArray {
	public static void main(String[] args) {
		
		double[][] array = { 
				{ 39.0, 78.0, 3.5 }, 
				{ 10.0, 57.5, 80.0 }, 
				{ 61.5, 33.5, 90 } 
				};
		// create a variable sum and assign it 0, we'll use that to assign the sums.

		double sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array[i].length; j++) {
				
				sum += array[i][j]; // summing the arrays with a loop
			}
		}
		
		System.out.println(sum);

	}

}
