public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setName("car");
        car.drive();
//        car.stop();
        // here using stop method of transport (parent) class, and drive method of car class (child)
        // if you need parent's method, use super
    }
}