// Definition of the Car class
class Car {
    // Instance variable to store the model of the car
    String model;

    // Method to start the car
    void start() {
        System.out.println(model + " starts.");
    }

    // Method to stop the car
    void stop() {
        System.out.println(model + " has stopped.");
    }
}

// Main class containing the entry point of the program
public class Main {
    public static void main(String[] args) {
        // Creating a new Car object
        Car c = new Car();

        // Setting the model of the car
        c.model = "Mustng GT";

        // Calling the start method
        c.start();

        // Calling the stop method
        c.stop();
    }
}
