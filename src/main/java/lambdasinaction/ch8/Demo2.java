package lambdasinaction.ch8;

import java.math.BigDecimal;

public class Demo2 {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
        test5();
    }

    private static void doSomeThing(Runnable r) {
        r.run();
    }

    private static void doSomeThing(Task a) {
        a.execute();
    }

    private static void test1() {
        doSomeThing(new Task() {
            @Override
            public void execute() {
                System.out.println("Danger danger!!");
            }
        });
    }

    private static void test2() {
        doSomeThing(new Runnable() {
            @Override
            public void run() {
                System.out.println("Danger danger!!");
            }
        });
    }

    // Problem;both doSomeThing(Runnable) and doSomeThing(Task) match
    // Error:(38, 9) java: reference to doSomeThing is ambiguous
    // both method doSomeThing(java.lang.Runnable) in lambdasinaction.ch8.Demo2 and method doSomeThing(lambdasinaction.ch8.Task) in lambdasinaction.ch8.Demo2 match
    /*private static void test3() {
        doSomeThing(() -> System.out.println("Danger danger!!"));
    }*/

    // You can solve the ambiguity by providing an explicit cast (Task):
    private static void test4() {
        doSomeThing((Task) () -> System.out.println("Danger danger!!"));
    }

    private static void test5(){
        BigDecimal bdec1 = new BigDecimal("1");
        BigDecimal bdec2 = new BigDecimal("3");
        BigDecimal bdec3 = new BigDecimal("3");

        int i = bdec1.compareTo(bdec2);
        int i1 = bdec2.compareTo(bdec3);
        int i2 = bdec2.compareTo(bdec1);

        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
    }
}
//