package com.syntax.classTask;

public class Pattern {

	public static void main(String[] args) {
			  
		    int i, j, max=7;
		    for( i=1; i<=7; i++){
		      
		      for(j=1; j<=max; j++){
		        System.out.print(j+" ");
		      }
		      System.out.println();
		      max--;
		    
			}
		    System.out.println("----------------Next-------------------");
		    int maxm=1;
		    for( i=1; i<=5; i++){
		      
		      for(j=1; j<=maxm; j++){
		        System.out.print(i+" ");
		      }
		      System.out.println();
		      maxm++;
		    }
		    System.out.println("----------------Next-------------------");
		    int maxim=1;
		    for( i=1; i<=7; i++){
		      
		      for(j=1; j<=maxim; j++){
		        System.out.print(j+" ");
		      }
		      System.out.println();
		      maxim++;
		    }
		    System.out.println("----------------Next-------------------");
		    int ma=7;
		    for( i=1; i<=6; i++){
		      
		      for(j=1; j<=ma; j++){
		        System.out.print(j+" ");
		      }
		      System.out.println();
		      ma--;
		    }
		    int m=1;
		    for( i=1; i<=7; i++){
		      
		      for(j=1; j<=m; j++){
		        System.out.print(j+" ");
		      }
		      System.out.println();
		      m++;
		    }
		    
		    System.out.println("----------------Next-------------------");
		    
		    int n=4;
		    for(i=1;i<=n;i++){
		    	for(j=1;j<=n;j++) {
		    		if(i==1||j==1||i==n||j==n){
		    	        System.out.print("$ ");
		    	        
		    	    }else{
		    	       System.out.print("  ");
		    	    }
		    	}
		    	System.out.println();
		    
		    }
		}   
	}