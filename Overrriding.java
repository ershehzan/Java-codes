class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();

        myAnimal.makeSound(); // Output: Generic animal sound
        myDog.makeSound();    // Output: Woof!

        Animal animalDog = new Dog();
        animalDog.makeSound(); // Output: Woof!
    }
}
