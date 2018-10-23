package springrecipes.sequence;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo1 {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SequenceGeneratorConfiguration.class);
    }
}
