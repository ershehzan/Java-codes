
class Animal {
    void eat() {
        System.out.println("Eating.");
    }

    void sleep() {
        System.out.println("Sleeping.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("barking.");
    }
}
public class Main {
    public static void main(String[] s) {
        Dog d = new Dog();
        d.eat();   
        d.sleep(); 
        d.bark();  
    }
}
