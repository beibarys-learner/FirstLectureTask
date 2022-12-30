package dev.java.oop;

import dev.java.oop.car.BMW;
import dev.java.oop.car.Car;
import dev.java.oop.car.Toyota;
import dev.java.oop.motorbike.Kawasaki;
import dev.java.oop.motorbike.Ural;

public class Main {
    public static void main(String[] args) {
        //rebuilt methods
        Toyota toyota = new Toyota();
        // you can switch between places - static and final
        Car car = new Car();
        System.out.println("car.year = " + car.year);
        System.out.println("toyota.year = " + toyota.year);

    }
}