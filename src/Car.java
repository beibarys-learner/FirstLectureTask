public class Car extends Transport{
    public Car() {
    }

    public Car(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

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

    public void sumNumbers(int d1, int d2){
//        Метод с типом void не возвращает никакой результат, а просто выполняет какой-то внутренний код.
        if(d1 > 0) {
            return;
        }
        else {
            System.out.println("d1 + d2 = " + d1 + d2);;
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



}
