import java.util.*;

public class Unique_char {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char[] unique = new char[text.length()];
        int count = 0;

        for(int i=0;i<text.length();i++){

            boolean found = false;

            for(int j=0;j<i;j++){
                if(text.charAt(i)==text.charAt(j)){
                    found = true;
                    break;
                }
            }

            if(!found){
                unique[count++] = text.charAt(i);
            }
        }

        System.out.println("Unique Characters:");

        for(int i=0;i<count;i++){
            System.out.print(unique[i] + " ");
        }
    }
}