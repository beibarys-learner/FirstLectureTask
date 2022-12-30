package dev.java.oop;

import dev.java.oop.car.BMW;
import dev.java.oop.car.Car;
import dev.java.oop.car.Toyota;
import dev.java.oop.motorbike.Kawasaki;
import dev.java.oop.motorbike.Ural;

public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(10);
//        engine.setVolume(10);

        Car car = new Car();
//        car.setEngine(engine);
        System.out.println("car.getEngine() = " + car.getEngine().getVolume());

//        Kawasaki kawasaki = new Kawasaki("Kawasaki", "Saki", "BLACK", 1.0, 2022);
//        kawasaki.jump();
//
//        Ural ural = new Ural("Kawasaki", "Saki", "BLACK", 1.0, true);
//        ural.showInfo();
    }
}