interface StreamingService {

    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription");
    }
}

interface GamingService {

    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription");
    }
}

class SmartTV implements StreamingService, GamingService {

    String movies[] = {
            "Avengers",
            "Inception",
            "Interstellar"
    };

    String games[] = {
            "Valorant",
            "Minecraft",
            "FIFA"
    };

    @Override
    public void streamMovie() {

        System.out.println("Movies Available:");

        for (String movie : movies)
            System.out.println(movie);
    }

    @Override
    public void playGame() {

        System.out.println("Games Available:");

        for (String game : games)
            System.out.println(game);
    }

    @Override
    public void showSubscriptionDetails() {

        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

public class Main {

    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        tv.streamMovie();

        tv.playGame();
    }
}