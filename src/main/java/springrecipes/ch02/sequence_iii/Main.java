package springrecipes.ch02.sequence_iii;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springrecipes.ch02.sequence_iii.config.SequenceConfiguration;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SequenceConfiguration.class);
        SequenceGenerator generator = context.getBean(SequenceGenerator.class);

        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());
    }
}
