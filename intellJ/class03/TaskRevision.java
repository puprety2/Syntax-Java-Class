package com.syntax.intellJ.class03;

import java.util.Scanner;

public class TaskRevision {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Username?");
        String userName=input.next();
        System.out.println("Please Enter Password?");
        String passwords= input.next();
        System.out.println("Please Confirmed Password");
        String password= input.next();

        if(userName.isEmpty() || passwords.isEmpty()){
            System.out.println("Username and Password should not be empty");
        }else if(passwords.length()<8){
            System.out.println("Password is too short");
        }else if(passwords.contains(userName)){
            System.out.println("Password cannot contain username");
        }else if(!passwords.equals(password)){
            System.out.println("Password do not match");
        }else{
            System.out.println("Your username and password has been created.");
        }
    }
}
