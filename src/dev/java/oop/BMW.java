package dev.java.oop;

public class BMW extends Car{
    public BMW() {
    }

    public BMW(String name, String model, String color) {
        super(name, model, color);
    }

    @Override
    public void drive() {
        super.signal(); // recalled from car
        super.drive();
        System.out.println("bmw drive");;
    }
}
