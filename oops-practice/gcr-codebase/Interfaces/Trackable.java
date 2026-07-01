interface Trackable {
    void logActivity();

    default void resetData() {
        System.out.println("Activity data reset.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity() {
        System.out.println("Activity Logged.");
    }

    @Override
    public void generateReport() {
        System.out.println("Fitness Report Generated.");
    }

    @Override
    public void sendAlert() {
        System.out.println("Daily Goal Reminder!");
    }
}

public class Main {
    public static void main(String[] args) {

        FitnessDevice watch = new FitnessDevice();

        watch.logActivity();
        watch.generateReport();
        watch.sendAlert();
        watch.resetData();
    }
}