/*
package spring_recipes_4th.ch02.POJOinitializationdestruction_iii.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import spring_recipes_4th.ch02.POJOinitializationdestruction_iii.SequenceGenerator;

@Configuration
public class SequenceConfiguration {
    @Bean
    @DependsOn({"datePrefixGenerator"})
    public SequenceGenerator sequenceGenerator() {
        SequenceGenerator sequence = new SequenceGenerator();
        sequence.setInitial(100000);
        sequence.setSuffix("A");
        return sequence;
    }
}
*/
