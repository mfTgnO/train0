package spring_recipes_4th.ch02.POJOinitializationdestruction_iii;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NumberPrefixGenerator implements PrefixGenerator {
    @Override
    public String getPrefix() {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        return String.format("%03d", randomInt);
    }
}
