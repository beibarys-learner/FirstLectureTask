package dev.java.oop.motorbike;

public class Kawasaki extends Motorbike{
    private int Year;

    public Kawasaki() {
    }

    public Kawasaki(String name, String model, String color, double volume, int year) {
        super(name, model, color, volume);
        Year = year;
    }

//    public Kawasaki(String name) {
//        super(name, model, color, volume);
//        Year = year;
//    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public void jump() {
        System.out.println("Kawasaki jump");
    }
}
