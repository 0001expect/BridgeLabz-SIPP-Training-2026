class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : " + name + "\nAge : " + age;
    }
}

class Student extends Person {

    final int studentId;
    double gpa;

    Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nStudent ID : " + studentId +
                "\nGPA : " + gpa;
    }
}

class GradStudent extends Student {

    String thesis;

    GradStudent(String name, int age, int studentId, double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nThesis : " + thesis;
    }
}

public class UniversitySystem {

    public static void main(String[] args) {

        GradStudent grad = new GradStudent(
                "Dev Sharma",
                21,
                101,
                8.7,
                "Machine Learning in Healthcare"
        );

        System.out.println(grad);

        System.out.println("\n----- IS-A Relationship -----");

        Person p = grad;
        Student s = grad;
        GradStudent g = grad;

        System.out.println("GradStudent IS-A Student : " + (g instanceof Student));
        System.out.println("Student IS-A Person : " + (s instanceof Person));
        System.out.println("GradStudent IS-A Person : " + (p instanceof Person));
    }
}