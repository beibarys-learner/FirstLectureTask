public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Teana", "sedan", "black");
        // here we created car with predefined fields
//        Car bmw = new Car();

        // we rewrite the previous project using setters
        // we set fields of Car
        //        nissan.setName("teana");
        //        nissan.setModel("sedan");
        //        nissan.setColor("black");
        nissan.setNum1(5);
        nissan.setNum2(210);
        // since we added getter and set for num1 and num2

        nissan.drive();

        nissan.sumNumbers(1, 2);

        // we print message by getting Name
        System.out.println("nissan's name will be " + nissan.getName() + " printed using getName");

    }
}