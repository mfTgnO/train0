package springrecipes.ch02.sequence_vi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springrecipes.ch02.sequence_vi.PrefixGenerator;
import springrecipes.ch02.sequence_vi.SequenceGenerator;

@Configuration
@Import(PrefixConfiguration.class)
public class SequenceConfiguration {
    @Value("#{datePrefixGenerator}")
    private PrefixGenerator prefixGenerator;

    @Bean
    public SequenceGenerator sequenceGenerator() {
        SequenceGenerator sequence = new SequenceGenerator();
        sequence.setInitial(100000);
        sequence.setSuffix("A");
        sequence.setPrefixGenerator(prefixGenerator);
        return sequence;
    }
}
