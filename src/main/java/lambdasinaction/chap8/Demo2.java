package lambdasinaction.chap8;

public class Demo2 {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
        test4();
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
    // both method doSomeThing(java.lang.Runnable) in lambdasinaction.chap8.Demo2 and method doSomeThing(lambdasinaction.chap8.Task) in lambdasinaction.chap8.Demo2 match
    /*private static void test3() {
        doSomeThing(() -> System.out.println("Danger danger!!"));
    }*/

    // You can solve the ambiguity by providing an explicit cast (Task):
    private static void test4() {
        doSomeThing((Task) () -> System.out.println("Danger danger!!"));
    }
}
