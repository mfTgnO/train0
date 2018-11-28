package lambdasinaction.ch8;

public class Demo1 {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }

    private static void test1() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        r.run();
    }

    private static void test2() {
        Runnable r = () -> System.out.println("World");
        r.run();
    }

    private static void test3() {
        int a = 10;
        Runnable r = new Runnable() {
            @Override
            public void run() {
                int a = 2;
                System.out.println(a);
            }
        };
        r.run();
    }

    /*private static void test4() {
        int a = 10;
        Runnable r = () -> {
            int a = 2;// Error:(40, 17) java: variable a is already defined in method test4()
            System.out.println(a);
        };
        r.run();
    }*/
}
