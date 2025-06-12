// Class representing an Employee
class Emp {
    // Fields to store employee's name, id, and monthly salary
    String name;
    int id;
    double salary;

    // Constructor to initialize employee details
    Emp(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }

    // Method to calculate annual salary
    double getYearSalary() {
        return salary * 12;
    }

    // Method to display employee details
    void show() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Monthly Salary: ₹" + salary);
        System.out.println("Annual Salary: ₹" + getYearSalary());
    }

    // Main method to test the Emp class
    public static void main(String[] args) {
        Emp e1 = new Emp("Rahul", 101, 25000); // Create an employee object
        e1.show(); // Display employee details
    }
}
