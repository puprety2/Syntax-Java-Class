package com.syntax.intellJ.class3;

public class Laptop {

    String make;
    String model;
    int hardDriveCapacity;
    int ramCapacity;
    String color;
    String processor;
    String GPU;

    void playMovies(){
        System.out.println("Playing movie");
    }
    void browseInternet(){
        System.out.println("Browse the Internet");
    }
    void makeVideoCall(String contact){
        System.out.println("Video calling to "+contact);
    }
    public String getModel(){
        return model;
    }
    int upgradeRam(int newRamUnit){
        return newRamUnit*ramCapacity;

    }
}
