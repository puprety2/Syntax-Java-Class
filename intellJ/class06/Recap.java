package com.syntax.intellJ.class06;

import java.util.Scanner;

public class Recap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name to proceed further with execution");
        String browser = sc.nextLine();

        if(browser.toLowerCase().equals("chrome")) System.out.println("Proceed with Chrome browser");
        else if(browser.toLowerCase().equals("firefox")){
            System.out.println("Proceed with Firefox browser");
        }else if(browser.toLowerCase().equals("ie")){
            System.out.println("Proceed with IE browser");
        }else{
            System.out.println("Invalid browser");
        }

    }
}
