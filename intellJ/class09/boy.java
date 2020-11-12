package com.syntax.intellJ.class09;

public class boy extends parent{
    boy(){
        System.out.println("from boy constructor");
    }
    boy(int money){
        super(money);
        System.out.println("from boy constructor");
    }

    public static void main(String[] args) {
        boy boys=new boy(1000);
        boys.print();
    }

}
