package OOPS;

public class Statickeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "ABC";
        s1.setName("Harsh");

        Student s2 = new Student();
        s2.setName("Rahul");

        Student s3 = new Student();
        s3.setName("Rohan");

        System.out.println(s1.getName() + " goes to " + s1.schoolName);
        System.out.println(s2.getName() + " goes to " + s2.schoolName);
        System.out.println(s3.getName() + " goes to " + s3.schoolName);
    }
}
class Student {
    String name;
    int roll;
    static String schoolName;

    void setName (String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}

