public class Student {
    // Private fields for student information and grades
    private String name;
    private int rollNumber;
    private double grade1, grade2;

    // Constructor to initialize the student's name, roll number, and two grades
    public Student(String name, int rollNumber, double grade1, double grade2) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    // Method to calculate the average of the two grades
    public double calculateAverage() {
        return (grade1 + grade2) / 2.0;
    }

    // Method to determine the grade status based on the average
    public String determineStatus() {
        double average = calculateAverage();

        if (average >= 90) {
            return "Excellent";
        } else if (average >= 75) {
            return "Good";
        } else if (average >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    // Method to display all student information, grades, and status
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grades: " + grade1 + ", " + grade2 );
        System.out.println("Average Grade: " + calculateAverage());
        System.out.println("Grade Status: " + determineStatus());
    }

    // Main method to create a Student object and display its information
    public static void main(String[] args) {
        Student student1 = new Student("abc", 101, 85, 78, 92); // Note: Constructor only accepts 4 arguments
        student1.displayStudentInfo();
    }
}
