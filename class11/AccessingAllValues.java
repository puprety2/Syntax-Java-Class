package com.syntax.class11;

public class AccessingAllValues {

	public static void main(String[] args) {
		char [][] $array=new char[3][4];
		//add value to first row
		$array[0][0]='A';
		$array[0][1]='B';
		$array[0][2]='C';
		$array[0][3]='D';
		
		//SECOND ROW
		$array[1][0]='W';
		$array[1][1]='X';
		$array[1][2]='Y';
		$array[1][3]='Z';
		
		//THIRD ROW
		$array[2][0]='Q';
		$array[2][1]='W';
		$array[2][2]='B';
		$array[2][3]='R';
		
		for(int i=0;i<$array.length;i++) {
			for(int j=0;j<$array[i].length;j++) {
				System.out.print($array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------");
		int [][] array= {
				{10, 20,30},
				{1,2,3},
				{100,200,300}
				
							};
		for(int r=0;r<array.length;r++) {
			for(int c=0; c<array[r].length;c++) {
				System.out.print(array[r][c]+" ");
			}
			System.out.println();
		}
	}

}
