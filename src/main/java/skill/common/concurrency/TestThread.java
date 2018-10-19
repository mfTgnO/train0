package skill.common.concurrency;

import skill.common.concurrency.interthreadcommunication.Chat;
import skill.common.concurrency.interthreadcommunication.T1;
import skill.common.concurrency.interthreadcommunication.T2;

public class TestThread {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
        test4();
    }

    private static void test1() {
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

    private static void test2() {
        RunnableDemo2 r1 = new RunnableDemo2("Thread-1");
        r1.start();
        RunnableDemo2 r2 = new RunnableDemo2("Thread-2");
        r2.start();

        try {
            Thread.sleep(1000);

            r1.suspend();
            System.out.println("Suspending First Thread");
            Thread.sleep(1000);
            r1.resume();
            System.out.println("Resuming First Thread");

            r2.suspend();
            System.out.println("Suspending thread Two");
            Thread.sleep(1000);
            r2.resume();
            System.out.println("Resuming thread Two");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Main thread Interrupted");
        }

        try {
            System.out.println("Waiting for threads to finish.");
            r1.t.join();
            r2.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }

    private static void test3() {
        Chat chat = new Chat();
        new T1(chat);
        new T2(chat);
    }

    private static void test4() {
        PrintDemo printDemo = new PrintDemo();
        ThreadDemo2 t1 = new ThreadDemo2("Thread - 1 ", printDemo);
        ThreadDemo2 t2 = new ThreadDemo2("Thread - 2 ", printDemo);
        t1.start();
        t2.start();

        // wait for threads to end
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");

        }

    }
}
