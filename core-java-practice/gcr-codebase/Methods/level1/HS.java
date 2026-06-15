import java.util.*;
public class HS{
    public static void HandShake(int n){
        int ans = (n*(n-1))/2;
        System.out.println(ans);
    }
    
    public static void main (String[] args){
		SCanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HandShake(n);
    } 
}