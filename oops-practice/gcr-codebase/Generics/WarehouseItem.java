import java.util.*;

abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }
}

class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }
}

class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }
}

class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }
}

class Storage<T extends WarehouseItem> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    void display() {
        for (T item : list)
            item.display();
    }
}

public class Main {

    static void show(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list)
            item.display();
    }

    public static void main(String args[]) {

        Storage<Electronics> s = new Storage<>();
        s.add(new Electronics("Laptop"));
        s.add(new Electronics("Mobile"));

        s.display();
    }
}