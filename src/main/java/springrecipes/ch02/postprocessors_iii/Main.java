package springrecipes.ch02.postprocessors_iii;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("appContext.xml");
        SequenceGenerator sequence = (SequenceGenerator) context.getBean("sequenceGenerator");

        System.out.println(sequence.getSequence());
        System.out.println(sequence.getSequence());
    }
}
