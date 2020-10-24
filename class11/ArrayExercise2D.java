package com.syntax.class11;

public class ArrayExercise2D {

	public static void main(String[] args) {
		
		String[][] foods= {
				{"Burger","Hotdogs","Steak"},
				{"Pizza","Pasta","Conoli"},
				{"Ramen","Sushi","Kimchi","Dumplings"},
				{"kebab","manto"},
				{"biryani","masala","chicken tandori","curry"}
			
				
		};
		System.out.println("<------------------Enhanced For Loop----------------->");
		System.out.println();
		
		
		for(String [] foodArray:foods) {
			for(String food:foodArray) {
				System.out.print(food+"  ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("<------------------Regular For Loop----------------->");
		System.out.println();
		for(int i=0;i<foods.length;i++) {
			for (int j=0; j<foods[i].length;j++){
				String dishes=foods[i][j];
				System.out.print(dishes+" ");
				
			}
			System.out.println();
		}

	}

}
