import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String word = "";

        for(int i=0;i<text.length();i++){

            char ch = text.charAt(i);

            if(ch!=' '){
                word += ch;
            }
            else{
                System.out.println(word);
                word="";
            }
        }

        System.out.println(word);
    }
}