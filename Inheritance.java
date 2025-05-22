// Base class representing a generic Animal
class Animal {
    // Method for animal eating behavior
    void eat() {
        System.out.println("Eating.");
    }

    // Method for animal sleeping behavior
    void sleep() {
        System.out.println("Sleeping.");
    }
}

// Derived class Dog that inherits from Animal
class Dog extends Animal {
    // Method specific to Dog for barking behavior
    void bark() {
        System.out.println("barking.");
    }
}

// Main class to run the application
public class Main {
    public static void main(String[] s) {
        // Create a Dog object
        Dog d = new Dog();
        // Call inherited method from Animal class
        d.eat();   
        // Call another inherited method from Animal class
        d.sleep(); 
        // Call Dog-specific method
        d.bark();  
    }
}
