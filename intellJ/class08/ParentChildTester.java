package com.syntax.intellJ.class08;

public class ParentChildTester {
    public static void main(String[] args) {
        Parent parent=new Parent();
        parent.printSomething();

        Child child =new Child();
        child.printSomething();
    }
}
