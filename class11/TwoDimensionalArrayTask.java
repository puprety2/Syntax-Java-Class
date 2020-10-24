package com.syntax.class11;

public class TwoDimensionalArrayTask {

	public static void main(String[] args) {
		
		String [][] names= {
				{"Mr","Mrs","Ms","Miss"},
				{"Smith","Jordan","Jackson","Obama"}
		};
		
			System.out.println(names[0][0]+" "+names[1][3]);
			
		
			System.out.println(names[0][1]+" "+names[1][0]);
	
			System.out.println(names[0][2]+" "+names[1][2]);
			System.out.println(names[0][3]+" "+names[1][1]);
			System.out.println("---------------------------------");
			
			String [][] cars= {
					{"jeep","ford","dodge"},
					{"Audi","Porshe","BMW"},
					{"Kia","Hyundai","Sonana"},
					{"Ferraro","Mesarati","Lamborghini"}
			};
			
			for(int r=0; r<cars.length;r++) {
				for(int c=0;c<cars[r].length;c++) {
					String carList=cars[r][c];
					System.out.print(carList+"  ");
				}
				System.out.println();
			}
			System.out.println("---------------------------------");
			
			for(String[]  carArray:cars) {
				for(String car:carArray) {
					System.out.print(car+"  ");
				}
				System.out.println();
					
				
			}
			
		}
		
	}		


