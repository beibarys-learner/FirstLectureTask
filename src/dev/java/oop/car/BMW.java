package dev.java.oop.car;

public class BMW extends Car{
    public BMW() {
        System.out.println("bmw");
    }

    public BMW(String name, String model, String color) {
        super(name, model, color);
    }

//    @Override
//    public void drive() {
//        System.out.println("bmw drive");;
//    }
}
