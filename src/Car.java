public class Car {
    public Car() {
    }

    public Car(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    private String name;
    private String model;
    private String color;

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

    void drive(){
        String hello = "hello";
        System.out.println("driven by " + name);
    }
    void stop(){
        System.out.println("stopped by " + name);
    }
}
