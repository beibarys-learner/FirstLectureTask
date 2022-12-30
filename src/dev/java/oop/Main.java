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
        toyota.year = 2000;
        System.out.println("toyota.year = " + toyota.year);
        
        BMW bmw = new BMW();
        System.out.println("bmw.year = " + bmw.year);

        //here we define static variable 2000, and it belongs to Transport class and its child classes


    }
}