package com.syntax.intellJ.class09;

public class puskarClass extends parentClass{

    int money;
    puskarClass(int money){
        super(money);

        System.out.println("From child");
    }
     void marry(){
         super.marry();
         System.out.println("i will marry katrina "+this.money);
     }


    public static void main(String[] args) {
        puskarClass puskarclass=new puskarClass(1000);
        puskarclass.marry();
    }


}
