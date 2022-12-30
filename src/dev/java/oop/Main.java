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
        System.out.println(toyota.formatText("Sample"));
        
        // method created which same as static variables
        // you can create object and then display it
        System.out.println("Car.formatText(\"Another one\") = " + Car.formatText("Another one"));
        // you can call it from class

//        System.out.println(Transport.formatText("asdasd"));

        //here we define static variable 2000, and it belongs to Transport class and its child classes


    }
}