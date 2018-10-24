package springrecipes.ch02.sequence_v.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springrecipes.ch02.sequence_v.DatePrefixGenerator;
import springrecipes.ch02.sequence_v.SequenceGenerator;

@Configuration
public class SequenceConfiguration {
    @Bean
    public DatePrefixGenerator datePrefixGenerator() {
        DatePrefixGenerator datePrefixGenerator = new DatePrefixGenerator();
        datePrefixGenerator.setPattern("yyyyMMdd");
        return datePrefixGenerator;
    }

    @Bean
    public SequenceGenerator sequenceGenerator() {
        SequenceGenerator sequence = new SequenceGenerator();
        sequence.setInitial(100000);
        sequence.setSuffix("A");
        return sequence;
    }
}
