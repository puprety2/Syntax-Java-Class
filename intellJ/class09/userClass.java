package com.syntax.intellJ.class09;

public class userClass {

    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */
    String name;
    String mobileNum;
    String address;
    public userClass(String name,String mobileNum) {
        this.name=name;
        this.mobileNum=mobileNum;
    }

    public userClass(String address) {

    }

    void display(){
        System.out.println("User Name: "+name+"| Mobile Number: "+mobileNum+"| Address: "+address);
    }
}
