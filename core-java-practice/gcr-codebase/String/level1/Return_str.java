import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        char[] arr1 = new char[text.length()];

        for(int i = 0; i < text.length(); i++){
            arr1[i] = text.charAt(i);
        }

        char[] arr2 = text.toCharArray();

        boolean same = true;

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                same = false;
                break;
            }
        }

        System.out.print("User Array: ");
        for(char ch : arr1){
            System.out.print(ch + " ");
        }

        System.out.println();

        System.out.print("Built In Array: ");
        for(char ch : arr2){
            System.out.print(ch + " ");
        }

        System.out.println();
        System.out.println("Arrays Same = " + same);
    }
}