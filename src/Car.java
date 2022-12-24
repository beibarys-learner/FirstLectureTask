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
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int sumNumbers(int d1, int d2){
        // return num1 + num2; // we added new int fields and method
        if(d1 > 0) {
            return d1;
        }
        else {
            return d1 + d2;
        }
    }


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
