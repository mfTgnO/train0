/*
package springrecipes.ch02.sequence_vi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springrecipes.ch02.sequence_vi.config.PrefixConfiguration;
import springrecipes.ch02.sequence_vi.config.SequenceConfiguration;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SequenceConfiguration.class);
        context.refresh();

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SequenceConfiguration.class, PrefixConfiguration.class);
//        SequenceGenerator generator = context.getBean(SequenceGenerator.class);
        SequenceGenerator generator = (SequenceGenerator) context.getBean("sequenceGenerator");

        System.out.println(generator.sequence());
        System.out.println(generator.sequence());
    }
}
*/
