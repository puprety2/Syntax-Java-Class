package com.syntax.class08;

public class ForTask {
	public static void main(String[] args){
		
		int sum=0;
		int sum1=0;
		for(int i=1; i<=50; i++) {
			if(i%2==0) {	
				sum+=i;
			}else {
				sum1+=i;
			}
		}
		System.out.print("Total sum of even: "+sum+" ");
		System.out.println("and total sum of odd: " +sum1);
		
	}

}
