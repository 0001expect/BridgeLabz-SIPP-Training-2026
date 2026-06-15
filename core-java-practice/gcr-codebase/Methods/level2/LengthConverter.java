import java.util.*;

public class LengthConverter {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double value = sc.nextDouble();

        System.out.println("Yards to Feet = " + convertYardsToFeet(value));
        System.out.println("Feet to Yards = " + convertFeetToYards(value));
        System.out.println("Meters to Inches = " + convertMetersToInches(value));
        System.out.println("Inches to Meters = " + convertInchesToMeters(value));
        System.out.println("Inches to CM = " + convertInchesToCm(value));
    }
}