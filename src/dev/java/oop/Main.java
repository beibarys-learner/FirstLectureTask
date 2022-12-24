package dev.java.oop;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.drive(); //bmw drive will be printed, since recent drive's Override will be used

        Toyota toyota = new Toyota();
        toyota.drive();
//        Car car = new Car("hyindai", "accent", "black", 213);
//        System.out.println("car.getName() = " + car.getName());
//        System.out.println("car.getModel() = " + car.getModel());
//        System.out.println("car.getColor() = " + car.getColor());
//        System.out.println("car.getNumber() = " + car.getNumber());
//

    }
}