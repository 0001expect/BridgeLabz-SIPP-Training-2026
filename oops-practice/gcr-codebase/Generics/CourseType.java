import java.util.*;

abstract class CourseType {

    String name;

    CourseType(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }
}

class ExamCourse extends CourseType {
    ExamCourse(String name) {
        super(name);
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String name) {
        super(name);
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String name) {
        super(name);
    }
}

class Course<T extends CourseType> {

    ArrayList<T> list = new ArrayList<>();

    void add(T c) {
        list.add(c);
    }

    void display() {
        for (T c : list)
            c.display();
    }
}

public class Main {

    static void show(List<? extends CourseType> list) {
        for (CourseType c : list)
            c.display();
    }

    public static void main(String args[]) {

        Course<ExamCourse> c = new Course<>();

        c.add(new ExamCourse("Java"));

        c.display();
    }
}