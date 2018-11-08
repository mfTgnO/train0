/*
package springrecipes.ch02.sequence_iv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springrecipes.ch02.sequence_iv.DatePrefixGenerator;
import springrecipes.ch02.sequence_iv.NumberPrefixGenerator;
import springrecipes.ch02.sequence_iv.SequenceGenerator;

@Configuration
public class SequenceConfiguration {
    */
/*@Bean
    public NumberPrefixGenerator numberPrefixGenerator() {
        return new NumberPrefixGenerator();
    }

    @Bean
    public DatePrefixGenerator datePrefixGenerator() {
        DatePrefixGenerator datePrefixGenerator = new DatePrefixGenerator();
        datePrefixGenerator.setPattern("yyyyMMdd");
        return datePrefixGenerator;
    }*//*


    @Bean
    public DatePrefixGenerator datePrefixGenerator() {
        DatePrefixGenerator datePrefixGenerator = new DatePrefixGenerator();
        datePrefixGenerator.setPattern("yyyyMMdd");
        return datePrefixGenerator;
    }

    @Bean
    public NumberPrefixGenerator numberPrefixGenerator(){
        return new NumberPrefixGenerator();
    }

    @Bean
    public SequenceGenerator sequenceGenerator(){
        SequenceGenerator sequence = new SequenceGenerator();
        sequence.setInitial(100000);
        sequence.setSuffix("A");
        return sequence;
    }
}
*/
