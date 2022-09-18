package com.sda2;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Mercedes");
        Car car3 = new Car("BMW", "M5", "BLUE");

        System.out.println("\n======================================");

        System.out.println("Car1 -> " + car1);
        System.out.println("Car2 -> " + car2);
        System.out.println("Car3 -> " + car3);

    }
}
