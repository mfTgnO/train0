package springrecipes.ch05.handlerequestsasynchronously;

import java.util.Random;

public class Delayer {
    private static final Random rnd = new Random();

    public Delayer() {
    }

    public static void delay(long delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void randomDelay() {
        int delay = rnd.nextInt(5500);
        delay(delay);
    }
}
