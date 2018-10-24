package springrecipes.ch02.sequence_i;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo1 {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
        test4();
    }

    private static void test1() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SequenceGeneratorConfiguration1.class);
        SequenceGenerator sequenceGenerator = (SequenceGenerator) applicationContext.getBean("sequenceGenerator");
        System.out.println(sequenceGenerator.getSequence());
        System.out.println(sequenceGenerator.getSequence());
    }

    // The getBean() method also supports another variation where you can provide the bean class name to
    // avoid making the cast.
    private static void test2() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SequenceGeneratorConfiguration1.class);
        SequenceGenerator sequenceGenerator = applicationContext.getBean("sequenceGenerator", SequenceGenerator.class);
        System.out.println(sequenceGenerator.getSequence());
        System.out.println(sequenceGenerator.getSequence());
    }

    // If there is only a single bean, you can omit the bean name.
    private static void test3() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SequenceGeneratorConfiguration1.class);
        SequenceGenerator sequenceGenerator = applicationContext.getBean(SequenceGenerator.class);
        System.out.println(sequenceGenerator.getSequence());
        System.out.println(sequenceGenerator.getSequence());
    }

    // Then, you can test the preceding components with the following test:
    private static void test4() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("springrecipes.ch02.sequence_i");
        SequenceDao sequenceDao = context.getBean(SequenceDao.class);
        System.out.println(sequenceDao.getNextValue("IT"));
        System.out.println(sequenceDao.getNextValue("IT"));
    }
}

