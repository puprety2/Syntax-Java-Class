package com.syntax.intellJ.class02;

public class Task {
    public static void main(String[] args) {

        String userName="pupty2";
        String passwords="Syntax@132";

        if(userName.isEmpty() || passwords.isEmpty()){
            System.out.println("Username and Password should not be empty");
        }else if(passwords.length()<8){
            System.out.println("Password is too short");
        }else if(passwords.contains(userName)){
            System.out.println("Password cannot contain username");
        }else if(!passwords.equals("Syntax@143")){
            System.out.println("Password do not match");
        }else{
            System.out.println("You successfully created Account");
        }

    }
}
