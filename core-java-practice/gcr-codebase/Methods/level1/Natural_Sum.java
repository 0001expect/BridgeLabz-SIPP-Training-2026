import java.util.*;
public class Natural_Sum{
    public int NSum(int n){
        int sum = 0;
        while(n>0){
            sum+=n;
            n--;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
		Natural_Sum s = new Natural_Sum();
        int result = s.NSum(n);
        System.out.println(result);
    }
}