package spring_recipes_4th.ch02.sequence_viii;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("appContext.xml");
        SequenceGenerator generator = (SequenceGenerator) context.getBean("sequenceGenerator");

        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());
    }
}
