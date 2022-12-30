package dev.java.oop.car;

import dev.java.oop.Engine;
import dev.java.oop.Transport;

public class Car extends Transport {
    // created constructor in car using none in dev.java.oop.Transport
    public Car(String name, String model, String color) {
        super(name, model, color); //put values to parent class
    }

    public Car(String name, String model, String color, int number) {
        super(name, model, color);
        this.number = number;
    }
    public Car(int number, Engine engine) {
        this.number = number;
        this.engine = engine; // added new Engine
    }

    public Car() {
    }

    private int number; // для всех авто нужно будет иметь номер
    private Engine engine;
    public final int wheelCount = 4; // car has 4 wheels

    public Car(Engine engine) {
    }


    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // уникальный метод только для Car и всех его дочерних классов
    public void signal(){
        System.out.println("signal");
    }

//    @Override
//    public void drive() {
//        // доработанный функционал для метода drive
//        System.out.println("drive car");
//    }
//
//    @Override
//    public void stop() {
//        System.out.println("stop car");
//    }
}
