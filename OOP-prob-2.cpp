public class Student {
    private String name;
    private int rollNumber;
    private double grade1, grade2;

    public Student(String name, int rollNumber, double grade1, double grade2) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public double calculateAverage() {
        return (grade1 + grade2) / 2.0;
    }

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

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grades: " + grade1 + ", " + grade2 );
        System.out.println("Average Grade: " + calculateAverage());
        System.out.println("Grade Status: " + determineStatus());
    }

    public static void main(String[] args) {
        Student student1 = new Student("abc", 101, 85, 78, 92);
        student1.displayStudentInfo();
    }
}
