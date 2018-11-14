/*
package spring_recipes_4th.ch02.POJOinitializationdestruction_iii;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_recipes_4th.ch02.POJOinitializationdestruction_iii.config.SequenceConfiguration;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SequenceConfiguration.class);
        SequenceGenerator sequence = (SequenceGenerator) context.getBean("sequenceGenerator");

        System.out.println(sequence.getSequence());
        System.out.println(sequence.getSequence());
        System.out.println(sequence.getSequence());
    }
}
*/
