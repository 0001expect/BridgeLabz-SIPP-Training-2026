import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String word = "";
        String shortest = "";
        String longest = "";

        boolean firstWord = true;

        for(int i=0;i<=text.length();i++){

            if(i==text.length() || text.charAt(i)==' '){

                if(firstWord){
                    shortest = word;
                    longest = word;
                    firstWord = false;
                }

                if(word.length() < shortest.length()){
                    shortest = word;
                }

                if(word.length() > longest.length()){
                    longest = word;
                }

                word="";
            }
            else{
                word += text.charAt(i);
            }
        }

        System.out.println("Shortest = " + shortest);
        System.out.println("Longest = " + longest);
    }
}