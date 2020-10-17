package com.syntax.classRevison;

public class NestedCondition {

	public static void main(String[] args) {
		
		String name="Puskar";
		String pass="pass123";
		double accountBalance=10.25;
		double transferAmount=8;
		boolean transAllowed=true;
		
		if (pass.equals("pass123")) {
			System.out.println("Welcome to Syntax bank "+name);
			if (transAllowed) {
				System.out.println("Insufficient balance");
				if(transferAmount>accountBalance) {
					System.out.println("Insufficient balance");
				}else { 
					System.out.println("transfer complete");
				}
				
			}else {
				System.out.println("You are not allowed to transfer");
			}
	
			
		} else {
			System.out.println("Invalid credentials please try again");
		}
		
		
	}

}
