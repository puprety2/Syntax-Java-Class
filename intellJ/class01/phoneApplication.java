package com.syntax.intellJ.class01;

public class phoneApplication {
    public static void main(String[] args) {
        smartPhone phone=new smartPhone();
        phone.brand="Iphone";
        phone.model="8";
        phone.color="Black";
        phone.name="Puskar";

        phone.dial(1234567896);
        phone.pics();
        phone.text("Hello World");


    }
}
