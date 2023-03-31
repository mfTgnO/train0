package com.example.demo.fundamental.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.junit.Test;

/**
 * @author:
 * @createDate: 2023-03-30 16:03
 * @description:
 */
public class ExecutorDemo {
    /**
     * The Executor interface has a single execute method to submit Runnable instances for execution.
     * <p>
     * Let's look at a quick example of how to use the Executors API to acquire an Executor instance backed by a
     * single thread pool and an unbounded queue for executing tasks sequentially.
     * <p>
     * Here, we run a single task that simply prints “Hello World“ on the screen. We'll submit the task as a
     * lambda (a Java 8 feature), which is inferred to be Runnable:
     * <p>
     * Executor接口有一个单一的execute方法来提交Runnable实例进行执行。
     * <p>
     * 让我们来看一个快速的例子，如何使用Executors API来获取一个由单个线程池和一个无界队列支持的Executor实例，以便按顺序执行任务。
     * <p>
     * 在这里，我们运行一个简单地在屏幕上打印 "Hello World "的单一任务。我们将把这个任务作为一个lambda（Java 8的一个特性）提交，它被推断为是Runnable：
     */
    @Test
    public void test1() {
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> System.out.println("Hello World"));
    }
}