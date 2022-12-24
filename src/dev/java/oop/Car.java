package dev.java.oop;

public class Car extends Transport{
    // created constructor in car using none in dev.java.oop.Transport
    public Car(String name, String model, String color) {
        super(name, model, color); //put values to parent class
    }

    public Car(String name, String model, String color, int number) {
        super(name, model, color);
        this.number = number;
    }

    public Car() {
    }

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void signal(){
        System.out.println("signaling");
    }
    // signal is unique for car, not available for transport


    @Override
    void drive() {
        System.out.println("car drive");
    }
    // we don't follow parent's method drive, instead we are using own drive methods


    @Override
    void stop() {
        System.out.println("car stop");
    }
}
