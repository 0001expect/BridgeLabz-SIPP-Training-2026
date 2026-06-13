import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];

        for(int i=0;i<10;i++){
            System.out.println("Person " + (i+1));

            System.out.print("Weight(kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Height(cm): ");
            data[i][1] = sc.nextDouble();
        }

        System.out.println("\nWeight\tHeight\tBMI\tStatus");

        for(int i=0;i<10;i++){

            double weight = data[i][0];
            double height = data[i][1] / 100.0;

            double bmi = weight / (height * height);

            String status;

            if(bmi < 18.5)
                status = "Underweight";
            else if(bmi < 25)
                status = "Normal";
            else if(bmi < 30)
                status = "Overweight";
            else
                status = "Obese";

            System.out.printf("%.1f\t%.1f\t%.2f\t%s\n",
                    weight,data[i][1],bmi,status);
        }
    }
}