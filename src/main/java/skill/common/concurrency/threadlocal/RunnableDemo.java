package skill.common.concurrency.threadlocal;

/*
 * https://www.tutorialspoint.com/java_concurrency/concurrency_threadlocal.htm
 * The ThreadLocal class is used to create thread local variables which can only be read and written by the same thread. For example,
 * if two threads are accessing code having reference to same threadLocal variable then each thread will not see any modification
 * to threadLocal variable done by other thread.
 * */
public class RunnableDemo implements Runnable {
    int counter;
    ThreadLocal<Integer> threadLocalCounter = new ThreadLocal<>();

    @Override
    public void run() {
        counter++;
        if (threadLocalCounter.get() != null) {
            threadLocalCounter.set(threadLocalCounter.get().intValue() + 1);
//            threadLocalCounter.set(threadLocalCounter.get() + 1);
        } else {
            threadLocalCounter.set(0);
        }
        System.out.println("Counter: " + counter);
        System.out.println("threadLocalCounter: " + threadLocalCounter.get());
    }
}
