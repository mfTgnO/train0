package skill.common.concurrency.deadlock;

/*
 * Deadlock describes a situation where two or more threads are blocked forever, waiting for each other. Deadlock occurs when multiple threads
 * need the same locks but obtain them in different order. A Java multithreaded program may suffer from the deadlock condition because the
 * synchronized keyword causes the executing thread to block while waiting for the lock, or monitor, associated with the specified object.
 * Here is an example.
 * */
public class Demo1 {
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();

    public static void main(String[] args) {
        ThreadDemo1 t1 = new ThreadDemo1();
        ThreadDemo2 t2 = new ThreadDemo2();
        t1.start();
        t2.start();
    }

    private static class ThreadDemo1 extends Thread {

        @Override
        public void run() {
            synchronized (Lock1) {
                System.out.println("Thread 1: Holding lock 1...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for lock 2...");
                synchronized (Lock2) {
                    System.out.println("Thread 1: Holding lock 1 & 2...");
                }
            }
        }
    }

    private static class ThreadDemo2 extends Thread {
        @Override
        public void run() {
            synchronized (Lock2) {
                System.out.println("Thread 2: Holding lock 2...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting for lock 1...");
                synchronized (Lock1) {
                    System.out.println("Thread 2: Holding lock 1 & 2...");
                }
            }
        }
    }
}
