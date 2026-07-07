import java.util.*;

abstract class JobRole {

    String role;

    JobRole(String role) {
        this.role = role;
    }

    void display() {
        System.out.println(role);
    }
}

class SoftwareEngineer extends JobRole {

    SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {

    DataScientist() {
        super("Data Scientist");
    }
}

class ProductManager extends JobRole {

    ProductManager() {
        super("Product Manager");
    }
}

class Resume<T extends JobRole> {

    T role;

    Resume(T role) {
        this.role = role;
    }

    void process() {
        role.display();
    }
}

public class Main {

    static void screening(List<? extends JobRole> list) {

        for (JobRole r : list)
            r.display();
    }

    public static void main(String args[]) {

        Resume<SoftwareEngineer> r =
                new Resume<>(new SoftwareEngineer());

        r.process();
    }
}