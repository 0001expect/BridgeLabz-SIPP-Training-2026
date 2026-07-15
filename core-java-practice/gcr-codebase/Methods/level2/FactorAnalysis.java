import java.util.*;

public class FactorAnalysis {

    public static int[] getFactors(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    public static int getSum(int[] factors) {
        int sum = 0;

        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }

        return sum;
    }

    public static int getProduct(int[] factors) {
        int product = 1;

        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }

        return product;
    }

    public static double getSquareSum(int[] factors) {
        double sum = 0;

        for (int i = 0; i < factors.length; i++) {
            sum += Math.pow(factors[i], 2);
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] factors = getFactors(n);

        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        System.out.println("\nSum = " + getSum(factors));
        System.out.println("Product = " + getProduct(factors));
        System.out.println("Sum of Squares = " + getSquareSum(factors));
    }
}