interface TextModeration {

    boolean checkOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive language allowed.");
    }

    static boolean containsRestrictedWords(String post) {

        return post.contains("bad") ||
                post.contains("hate");
    }
}

interface SpamDetection {

    boolean checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("No spam content allowed.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public boolean checkOffensive(String post) {

        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean checkSpam(String post) {

        return post.contains("Buy Now") ||
                post.contains("Click Here");
    }

    @Override
    public void displayModerationPolicy() {

        System.out.println("Posts should not contain spam or offensive words.");
    }
}

public class Main {

    public static void main(String[] args) {

        String posts[] = {
                "Hello Everyone",
                "Buy Now and Save",
                "I hate this",
                "Click Here to Win",
                "Have a Nice Day"
        };

        ContentModerator cm = new ContentModerator();

        cm.displayModerationPolicy();

        for (String post : posts) {

            if (cm.checkSpam(post))
                System.out.println(post + " -> Spam");

            else if (cm.checkOffensive(post))
                System.out.println(post + " -> Offensive");

            else
                System.out.println(post + " -> Valid");
        }
    }
}