package com.syntax.intellJ.class01;

public class BankApplication {
    public static void main(String[] args) {

        Account puskarAccount=new Account();
        puskarAccount.accountId="123";
        puskarAccount.userName="puprety2";
        puskarAccount.password="pu123";
        puskarAccount.balance=100000;
        puskarAccount.typeOfAccount="checking";
        puskarAccount.limit=100;

        boolean isLoggedIn=puskarAccount.login("puprety2","pu123");
        if(isLoggedIn){
            System.out.println("Welcome to Syntax Bank");
        }else{
            System.out.println("Invalid user name or password");
        }

        double Amount=puskarAccount.transferMoney(500000);
        if(Amount==0){
            System.out.println("Insufficient Money");
        }else{
            System.out.println(Amount+" transferred");
        }

        Account prakritiAccount=new Account();
        prakritiAccount.accountId="132";
        prakritiAccount.userName="ppathak2";
        prakritiAccount.password="pp143";
        prakritiAccount.balance=120000;
        prakritiAccount.typeOfAccount="saving";
        prakritiAccount.limit=150;


    }
}
