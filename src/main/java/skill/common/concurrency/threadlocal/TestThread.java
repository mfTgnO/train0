package skill.common.concurrency.threadlocal;

public class TestThread {
    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        RunnableDemo runnableDemo = new RunnableDemo();

        Thread t1 = new Thread(runnableDemo);
        Thread t2 = new Thread(runnableDemo);
        Thread t3 = new Thread(runnableDemo);
        Thread t4 = new Thread(runnableDemo);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // wait for threads to end
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Interrupted");
        }
    }
}
