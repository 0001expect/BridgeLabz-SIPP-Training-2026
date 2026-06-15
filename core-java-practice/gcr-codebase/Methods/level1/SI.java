import java.util.*;
public class SI{
    
    public static double SimpleIntrest(double principal, double rate, double time){
    double si = (principal*rate*time)/100;
    return si;
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double principal, rate, time;
		
		principal = sc.nextDouble();
		rate = sc.nextDouble();
		time = sc.nextDouble();
		
		double d = SimpleIntrest(principal, rate, time);
		System.out.println(d);
	}
}