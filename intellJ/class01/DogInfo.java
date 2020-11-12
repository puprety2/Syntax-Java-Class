package com.syntax.intellJ.class01;

public class DogInfo {
    public static void main(String[] args) {
        Dog doggy=new Dog();
        doggy.bread="German Shepard";
        doggy.color="White";
        doggy.age=5;
        doggy.name="Tommy";
        doggy.gender='F';
        doggy.healthy=true;

        doggy.bark();
        doggy.run();
        doggy.sleep();
        System.out.println(doggy.healthy);
    }
}
