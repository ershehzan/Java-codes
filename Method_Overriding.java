// Base class representing a generic Animal
class Animal {
    // Method to make a generic animal sound
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

// Dog class that inherits from Animal
class Dog extends Animal {
    // Override the makeSound() method to provide a specific implementation for Dog
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Main class to demonstrate method overriding
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create an Animal object
        Dog myDog = new Dog();         // Create a Dog object

        myAnimal.makeSound(); // Output: Generic animal sound (calls Animal's method)
        myDog.makeSound();    // Output: Woof! (calls Dog's overridden method)

        Animal animalDog = new Dog();  // Polymorphism: Animal reference to a Dog object
        animalDog.makeSound();         // Output: Woof! (calls Dog's method due to overriding)
    }
}
