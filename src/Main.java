public class Main {
    public static void main(String[] args) {
        Car nissan = new Car();
        Car bmw = new Car();

        // we rewrite the previous project using setters
        // we set properties of Car
        nissan.setColor("black");
        nissan.setName("teana");
        nissan.setModel("sedan");
        nissan.drive();

        // we print message by getting Name
        System.out.println("nissan's name will be " + nissan.getName() + " printed using getName");

    }
}