import java.util.*;
public class PNZ{
    public static int Check(int n){
        if(n==0){
            return 0;
        }else if(n<0){
            return -1;
        }else{
            return 1;
        }
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int res = Check(n);
        System.out.println(res);
        
    }
}









