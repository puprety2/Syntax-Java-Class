package com.syntax.class09;

public class NestedClock {

	public static void main(String[] args) {
		for(int h=0; h<24;h++) {
			for (int m=0;m<60; m++) {
				if(h<10) {
				if(m<10) {
					System.out.println("0"+h+":0"+m);
				}else {
					System.out.println("0"+h+":"+m);
						
					}
					
				}else {
					if(h>10 && m<10) {
						System.out.println(h+":0"+m);
						
					}else {
				
						System.out.println(h+":"+m);
					}
				}
				}
			}
		}

	}
	


