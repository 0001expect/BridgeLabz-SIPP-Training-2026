import java.util.*;
public class Season{
    public static boolean Check(int a, int b){
        if(a==3 && b>=20){
            return true;
        }else if(a==4 || a==5){
            return true;
        }else if(a==6 && b<=20){
            return true;
        }else{
            return false;
        }
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        
        boolean res = Check(a, b);
        if(res==true){
            System.out.println("spring season");
        }else{
            System.out.println("not a spring season");
        }
        System.out.println(res);
        
    }
}









