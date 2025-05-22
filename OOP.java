class Car {
    String model;
    void start() {
        System.out.println(model + " starts.");
    }
    void stop() {
        System.out.println(model + " has stopped.");
    }
}
public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.model = "Mustng GT";
        c.start();
        c.stop();
    }
}
