package com.syntax.intellJ.class3;

public class LaptopObject {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.make="Mac";
        laptop.model="Pro 16";
        laptop.hardDriveCapacity=1;
        laptop.ramCapacity=16;
        laptop.color="Black";
        laptop.processor="Core i7";
        laptop.GPU="Nvidia RTX 3090 12GB DDR6x";

        laptop.playMovies();
        laptop.browseInternet();
        laptop.makeVideoCall("4554-5455-5455");
        String model = laptop.getModel();
        System.out.println(model);
        System.out.println(laptop.getModel());

        System.out.println(laptop.upgradeRam(2));
    }
}
