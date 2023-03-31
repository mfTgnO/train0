package com.example.demo.fundamental.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author:
 * @createDate: 2023-03-30 16:27
 * @description:
 */
@Slf4j
public class ThreadPoolExecutorDemo {
    /**
     * The ThreadPoolExecutor is an extensible thread pool implementation with lots of parameters and hooks for
     * fine-tuning.
     * <p>
     * The main configuration parameters that we'll discuss here are corePoolSize, maximumPoolSize and keepAliveTime.
     * <p>
     * The pool consists of a fixed number of core threads that are kept inside all the time. It also consists of some
     * excessive threads that may be spawned and then terminated when they are no longer needed.
     * <p>
     * The corePoolSize parameter is the number of core threads that will be instantiated and kept in the pool. When a
     * new task comes in, if all core threads are busy and the internal queue is full, the pool is allowed to grow up
     * to
     * maximumPoolSize.
     * <p>
     * The keepAliveTime parameter is the interval of time for which the excessive threads (instantiated in excess of
     * the corePoolSize) are allowed to exist in the idle state. By default, the ThreadPoolExecutor only considers
     * non-core threads for removal. In order to apply the same removal policy to core threads, we can use the
     * [allowCoreThreadTimeOut(true)](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ThreadPoolExecutor.html#allowCoreThreadTimeOut(boolean))
     * method.
     * <p>
     * These parameters cover a wide range of use cases, but the most typical configurations are predefined in the
     * Executors static methods.
     * <p>
     * ThreadPoolExecutor是一个可扩展的线程池实现，有很多参数和钩子用于微调。
     * <p>
     * 我们将在这里讨论的主要配置参数是corePoolSize、maximumPoolSize和keepAliveTime。
     * <p>
     * 该池由固定数量的核心线程组成，这些线程一直保持在里面。它也由一些过度的线程组成，这些线程可能会被生成，然后在不再需要时被终止。
     * <p>
     * corePoolSize参数是将被实例化并保存在池中的核心线程的数量。当一个新任务进来时，如果所有的核心线程都很忙，而且内部队列已满，则允许池子增长到maximumPoolSize。
     * <p>
     * keepAliveTime参数是允许过多的线程（实例化超过corePoolSize）在空闲状态下存在的时间间隔。默认情况下，
     * ThreadPoolExecutor只考虑非核心线程的移除。为了对核心线程应用同样的移除策略，
     * 我们可以使用[allowCoreThreadTimeOut(true)]
     * (https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/ThreadPoolExecutor.html#allowCoreThreadTimeOut(boolean))方法。
     * <p>
     * 这些参数涵盖了广泛的使用情况，但最典型的配置是在Executors的静态方法中预定义的。
     */
    /**
     * Let's look at an example. *newFixedThreadPool* method creates a *ThreadPoolExecutor* with equal *corePoolSize*
     * and *maximumPoolSize* parameter values and a zero *keepAliveTime*. This means that the number of threads in this
     * thread pool is always the same:
     * <p>
     * 让我们看一个例子。*newFixedThreadPool*方法创建了一个*ThreadPoolExecutor*，其*corePoolSize*和*maximumPoolSize*参数值相等，
     * *keepAliveTime*为零。这意味着该线程池中的线程数量始终是相同的：
     */
    /**
     * Here, we instantiate a *ThreadPoolExecutor* with a fixed thread count of 2. This means that if the number of
     * simultaneously running tasks is always less than or equal to two, they get executed right away. Otherwise,
     * **some
     * of these tasks may be put into a queue to wait for their turn.**
     * <p>
     * We created three *Callable* tasks that imitate heavy work by sleeping for 1000 milliseconds. The first two tasks
     * will be run at once, and the third one will have to wait in the queue. We can verify it by calling
     * the *getPoolSize()* and *getQueue().size()* methods immediately after submitting the tasks.
     * <p>
     * 在这里，我们实例化了一个*ThreadPoolExecutor*，其固定线程数为2。这意味着，如果同时运行的任务数量总是小于或等于2，它们就会被立即执行。
     * 否则，**这些任务中的一些可能会被放入队列，等待轮到它们。
     * <p>
     * 我们创建了三个**可调用*任务，通过睡眠1000毫秒来模仿繁重的工作。前两个任务将被同时运行，第三个任务将不得不在队列中等待。
     * 我们可以在提交任务后立即调用*getPoolSize()*和*getQueue().size()*方法来验证。
     */
    @Test
    public void newFixedThreadPoolTest() {
        long l0 = System.currentTimeMillis();
        log.info("Checkpoint: {}, time: {}", 0, l0);

        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        long l1 = System.currentTimeMillis();
        log.info("Checkpoint: {}, time: {}", 1, l1 - l0);

        threadPoolExecutor.submit(() -> {
            try {
                long l2 = System.currentTimeMillis();
                log.info("Checkpoint: {}, time: {}", 2, l2 - l1);
                Thread.sleep(1000);
                long l3 = System.currentTimeMillis();
                log.info("Checkpoint: {}, time: {}", 3, l3 - l2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        });
        threadPoolExecutor.submit(() -> {
            try {
                long l4 = System.currentTimeMillis();
                log.info("Checkpoint: {}, time: {}", 4, l4);
                Thread.sleep(1000);
                long l5 = System.currentTimeMillis();
                log.info("Checkpoint: {}, time: {}", 5, l5 - l4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        });
        threadPoolExecutor.submit(() -> {
            try {
                long l6 = System.currentTimeMillis();
                log.info("Checkpoint: {}, time: {}", 6, l6);
                Thread.sleep(1000);
                long l7 = System.currentTimeMillis();
                log.info("Checkpoint: {}, time: {}", 7, l7 - l6);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        });
        Assert.assertEquals(2, threadPoolExecutor.getPoolSize());
        Assert.assertEquals(1, threadPoolExecutor.getQueue().size());

    }
}