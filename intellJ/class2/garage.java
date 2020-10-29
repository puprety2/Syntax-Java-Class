package com.syntax.intellJ.class2;

import java.util.Scanner;

public class garage {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Car car1=new Car();
        car1.numberOfDoor=4;
        car1.color="Black";
        car1.size=4;
        car1.make="BMW";
        car1.model="i8";

        Car car2=new Car();
        car2.numberOfDoor=4;
        car2.color="Silver";
        car2.size=4;
        car2.make="Honda";
        car2.model="Civic";

        System.out.println("car1.make :"+car1.make);
        System.out.println("car2.make :"+car2.make);
    }
}
