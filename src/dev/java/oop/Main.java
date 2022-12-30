package dev.java.oop;

import dev.java.oop.car.BMW;
import dev.java.oop.car.Car;
import dev.java.oop.car.Toyota;
import dev.java.oop.motorbike.Kawasaki;
import dev.java.oop.motorbike.Ural;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(new Engine(10));
        System.out.println("car = " + car.wheelCount);
        Ural ural = new Ural();
        System.out.println("ural.wheelCount = " + ural.wheelCount);
    }
}