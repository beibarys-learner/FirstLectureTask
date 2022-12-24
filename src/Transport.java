// which is same for all transport
// add name fields and drive, stop methods
public class Transport {
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
