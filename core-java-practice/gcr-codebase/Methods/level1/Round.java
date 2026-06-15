import java.util.*;
public class Round{
    public double Run(double a, double b, double c){
        int dist = 5000;
        double perimeter = a+b+c;
        double result = dist/perimeter;
        return result;
        
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        HS obj = new HS();
        double d = obj.Run(a, b, c);
        System.out.println(d);
        
    }
}









