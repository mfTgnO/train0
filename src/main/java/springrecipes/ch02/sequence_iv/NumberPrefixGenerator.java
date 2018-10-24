package springrecipes.ch02.sequence_iv;

import java.util.Random;

public class NumberPrefixGenerator implements PrefixGenerator {
    @Override
    public String getPrefix() {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        return String.format("%03d", randomInt);
    }
}
