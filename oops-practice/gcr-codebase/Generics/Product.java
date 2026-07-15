import java.util.*;

class Product<T> {

    T category;
    double price;

    Product(T category, double price) {
        this.category = category;
        this.price = price;
    }

    void display() {
        System.out.println(category + " " + price);
    }
}

class BookCategory {
    public String toString() {
        return "Books";
    }
}

class ClothingCategory {
    public String toString() {
        return "Clothing";
    }
}

class GadgetCategory {
    public String toString() {
        return "Gadgets";
    }
}

public class Main {

    static <T extends Product<?>> void applyDiscount(T p, double per) {
        p.price = p.price - (p.price * per / 100);
    }

    public static void main(String args[]) {

        Product<BookCategory> p = new Product<>(new BookCategory(), 500);

        p.display();

        applyDiscount(p, 20);

        p.display();
    }
}