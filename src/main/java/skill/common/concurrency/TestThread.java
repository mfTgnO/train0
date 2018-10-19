package skill.common.concurrency;

public class TestThread {
    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("Thread-1");
        r1.start();
        RunnableDemo r2 = new RunnableDemo("Thread-2");
        r2.start();

        System.out.println("-------------------------------------------------------------");
        ThreadDemo t1 = new ThreadDemo("Thread-3");
        t1.start();
        ThreadDemo t2 = new ThreadDemo("Thread-4");
        t2.start();
    }
}
