package dev.java.oop.motorbike;

import dev.java.oop.Transport;

public class Motorbike extends Transport {
    private double Volume;
    public final int wheelCount = 2; // car has 4 wheels

    public Motorbike() {
    }

    public Motorbike(String name, String model, String color, double volume) {
        super(name, model, color);
        Volume = volume;
    }


    public double getVolume() {
        return Volume;
    }

    public void setVolume(double volume) {
        Volume = volume;
    }
}
