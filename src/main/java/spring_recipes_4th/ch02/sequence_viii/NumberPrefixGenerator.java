package spring_recipes_4th.ch02.sequence_viii;

import java.util.Random;

@NumberPrefixAnnotation
public class NumberPrefixGenerator implements PrefixGenerator {
    @Override
    public String getPrefix() {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        return String.format("%03d", randomInt);
    }
}
