public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setName("car");
        car.drive();
        car.setNumber(2543);
        System.out.println("car.getNumber() = " + car.getNumber());
    }
}