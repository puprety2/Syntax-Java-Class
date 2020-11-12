package com.syntax.intellJ.class09;

public class grandParent {
    int money;
    grandParent(){
        System.out.println("constructor from grandparent");
    }
    grandParent(int money){
        this.money=money;
        System.out.println("constructor from grandparent");
    }
    void print(){
        System.out.println("I have this much money "+money);
    }
}
