package dev.java.oop.motorbike;

public class Kawasaki extends Motorbike{
    public Kawasaki() {
    }

    public Kawasaki(String name, String model, String color, double volume) {
        super(name, model, color, volume);
    }

    // deleted getter and setters


    public void jump() {
        System.out.println("Kawasaki jump");
    }
}
