package dev.java.oop.motorbike;

public class Ural extends Motorbike{
    public Ural() {
    }

    public Ural(String name, String model, String color, double volume, boolean firstAidKit) {
        super(name, model, color, volume);
        FirstAidKit = firstAidKit;
    }

    private boolean FirstAidKit;

    public boolean isFirstAidKit() {
        return FirstAidKit;
    }

    public void setFirstAidKit(boolean firstAidKit) {
        FirstAidKit = firstAidKit;
    }

    public void showInfo(){
        System.out.println("Name is" + getName());
        System.out.println("Volume is" + getVolume());
        System.out.println("Aid is " + isFirstAidKit());
    }
}
