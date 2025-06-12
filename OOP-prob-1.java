class Emp {
    String name;
    int id;
    double salary;

    // Constructor
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

    public static void main(String[] args) {
        Emp e1 = new Emp("Rahul", 101, 25000);
        e1.show();
    }
}
