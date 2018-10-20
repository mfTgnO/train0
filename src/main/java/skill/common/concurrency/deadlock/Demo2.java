package skill.common.concurrency.deadlock;

/*
 * https://www.tutorialspoint.com/java_concurrency/concurrency_deadlock.htm
 * Deadlock Solution Example
 * Let's change the order of the lock and run of the same program to see if both the threads still wait for each other −
 * */
public class Demo2 {
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
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("Thread 1: Waiting for lock 2...");
                }
                synchronized (Lock2) {
                    System.out.println("Thread 1: Holding lock 1 & 2...");
                }
            }
        }
    }

    private static class ThreadDemo2 extends Thread {
        @Override
        public void run() {
            System.out.println("Thread 2: Holding lock 2...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Thread 2: Waiting for lock 2...");
            }
            synchronized (Lock1) {
                System.out.println("Thread 2: Holding lock 1 & 2...");
            }
        }
    }

}
