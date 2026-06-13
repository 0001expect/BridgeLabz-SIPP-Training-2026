import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        }
        catch (Exception e) {
        }

        System.out.println("Length without length() = " + count);
        System.out.println("Using length() = " + str.length());
    }
}