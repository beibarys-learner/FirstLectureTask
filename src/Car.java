public class Car extends Transport{
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void signal(){
        System.out.println("signaling");
    }
    // signal is unique for car, not available for transport


    @Override
    void drive() {
        System.out.println("car drive");;
    }
    // we don't follow parent's method drive, instead we are using own drive methods
}
