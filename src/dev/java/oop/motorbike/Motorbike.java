package dev.java.oop.motorbike;

import dev.java.oop.Transport;

public class Motorbike extends Transport {
    private double Volume;
    public final int wheelCount = 2; // car has 4 wheels
    // update all here
    public Motorbike() {
    }

    public Motorbike(String name, String model, String color, double volume) {
        super(name, model, color);
        Volume = volume;
    }

    public Motorbike(String name, String model, String color) {
        super(name, model, color);
    }

    public double getVolume() {
        return Volume;
    }

    public void setVolume(double volume) {
        Volume = volume;
    }
}
