// Student class demonstrates encapsulation by keeping fields private and providing public getters and setters
class Student {
    // Private fields cannot be accessed directly from outside the class
    private String name;
    private int rollno;

    // Setter method for name
    public void setName(String n) {
        name = n;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for roll number
    public void setRollno(int r) {
        rollno = r;
    }

    // Getter method for roll number
    public int getRollno() {
        return rollno;
    }
}

// Main class to test the Student class
public class Main {
    public static void main(String[] args) {
        // Create an object of Student
        Student s = new Student();

        // Set name and roll number using setter methods
        s.setName("Nand Kishor");
        s.setRollno(51110103);

        // Get and print name and roll number using getter methods
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Roll Number is: " + s.getRollno());
    }
}
