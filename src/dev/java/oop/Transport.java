package dev.java.oop;

// which is same for all transport
// add name fields and drive, stop methods
public abstract class Transport {
    // let's create a constructor for dev.java.oop.Transport class
    public Transport() {
    }

    public Transport(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    private String name;
    private String model;
    private String color;
    public static int year; // added static variable
    // static variables same value for all transport and its parent classes

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    void drive(){
//        String hello = "hello";
//        System.out.println("driven by " + name + " called from transport");
//    }
//    void stop(){
//        System.out.println("stopped by " + name + " called from transport");
//    }

    public void drive(){
        System.out.println("drive transport");
    };

    public void stop(){
        System.out.println("stop transport");
    };
}
