import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] freq = new int[256];

        for(int i=0;i<text.length();i++){
            freq[text.charAt(i)]++;
        }

        boolean[] printed = new boolean[256];

        for(int i=0;i<text.length();i++){

            char ch = text.charAt(i);

            if(!printed[ch]){
                System.out.println(ch + " = " + freq[ch]);
                printed[ch] = true;
            }
        }
    }
}