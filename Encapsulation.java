class Student {
    private String name;
    private int rollno;
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }

    public void setRollno(int r) {
        rollno = r;
    }
    public int getRollno() {
        return rollno;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Nand Kishor");
        s.setRollno(51110103);

        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Roll Number is: " + s.getRollno());
    }
}
