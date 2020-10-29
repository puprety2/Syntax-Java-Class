package com.syntax.intellJ.class2;

public class Account {
    String accountId;
    String userName;
    String password;
    double balance;
    String typeOfAccount;
    double limit;
    boolean isBlocked;

    double transferMoney(double transfer) {
        if (balance > transfer) {
            return balance -= transfer;
        } else {
            return 0;
        }
    }
    boolean login (String entereduserName, String enteredpassword){
        if(userName.equals(entereduserName) && password.equals(enteredpassword)) {
            return true;
        }else {
            return false;
        }





        }


        }




