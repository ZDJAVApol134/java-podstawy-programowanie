package com.sda2;

public class Car {

    private String make;
    private String model;
    private String color;

    public Car() {
        System.out.println("No params constructor");
    }

    public Car(String make) {
        this(make,"CLS", "BLACK");
        System.out.println("One param constructor");
    }

    public Car(String make, String model, String color) {
        System.out.println("All param constructor");
        this.make = make;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Make: " + make + " Model: " + model + " Color: " + color;
    }
}
