package springrecipes.ch02.sequence_vi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springrecipes.ch02.sequence_vi.DatePrefixGenerator;

@Configuration
public class PrefixConfiguration {
    @Bean
    public DatePrefixGenerator datePrefixGenerator() {
        DatePrefixGenerator datePrefixGenerator = new DatePrefixGenerator();
        datePrefixGenerator.setPattern("yyyyMMdd");
        return datePrefixGenerator;
    }
}
