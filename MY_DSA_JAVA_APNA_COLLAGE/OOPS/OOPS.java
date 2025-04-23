// Save this in OOPS.java

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.roll = 123;
        s1.password = "abcd";

        Student s2 = new Student(s1); // using copy constructor
        s2.password = "xyz";

        // Let's print to verify
        System.out.println("s1: " + s1.name + ", " + s1.roll + ", " + s1.password);
        System.out.println("s2: " + s2.name + ", " + s2.roll + ", " + s2.password);
    }
}

class Student {
    String name;
    int roll;
    String password;

    // Default constructor
    Student() {
    }

    // Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.roll = s.roll;
        // Not copying password intentionally (optional)
    }
}
