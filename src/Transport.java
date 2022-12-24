// which is same for all transport
// add name fields and drive, stop methods
public class Transport {
    private String name;

    void drive(){
        String hello = "hello";
        System.out.println("driven by " + name);
    }
    void stop(){
        System.out.println("stopped by " + name);
    }
}
