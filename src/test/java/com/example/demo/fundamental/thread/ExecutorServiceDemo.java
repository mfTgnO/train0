package com.example.demo.fundamental.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.junit.Test;

/**
 * @author:
 * @createDate: 2023-03-30 16:10
 * @description:
 */
public class ExecutorServiceDemo {
    /**
     * The ExecutorService interface contains a large number of methods to control the progress of the tasks
     * and manage the termination of the service. Using this interface, we can submit the tasks for execution
     * and also control their execution using the returned Future instance.
     * <p>
     * Now we'll create an ExecutorService, submit a task and then use the returned Future‘s get method to wait until
     * the submitted task finishes and the value is returned:
     * <p>
     * ExecutorService接口包含大量的方法来控制任务的进度和管理服务的终止。使用这个接口，我们可以提交任务进行执行，也可以使用返回的Future实例控制任务的执行。
     * <p>
     * 现在我们将创建一个ExecutorService，提交一个任务，然后使用返回的Future的get方法来等待，直到提交的任务完成并返回值：
     */
    /**
     * Of course, in a real-life scenario, we usually don't want to call *future.get()* right away but defer calling it
     * until we actually need the value of the computation.
     * <p>
     * Here, we overload the *submit* method to take either *Runnable* or *Callable*. Both of these are functional
     * interfaces, and we can pass them as lambdas (starting with Java 8).
     * <p>
     * *Runnable*‘s single method does not throw an exception and does not return a value. The *Callable* interface may
     * be more convenient, as it allows us to throw an exception and return a value.
     * <p>
     * Finally, to let the compiler infer the *Callable* type, simply return a value from the lambda.
     * <p>
     * For more examples of using the *ExecutorService* interface and futures, have a look at [A Guide to the Java
     * ExecutorService](https://www.baeldung.com/java-executor-service-tutorial).
     * <p>
     * 当然，在现实生活中，我们通常不想立即调用*future.get()*，而是推迟到我们真正需要计算值的时候再调用。
     * <p>
     * 在这里，我们重载了*submit*方法，以接受*Runnable*或*Callable*。这两个都是函数式接口，我们可以把它们作为lambdas来传递（从Java 8开始）。
     * <p>
     * *Runnable*的单一方法不抛出异常，也不返回值。而*Callable*接口可能更方便，因为它允许我们抛出一个异常并返回一个值。
     * <p>
     * 最后，为了让编译器推断出*Callable*的类型，只需从lambda中返回一个值。
     * <p>
     * 关于使用*ExecutorService*接口和期货的更多例子，请看[A Guide to the Java ExecutorService]（https://www.baeldung.com/java-executor-service-tutorial）。
     */
    @Test
    public void test1() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<String> future = executorService.submit(() -> "Hello World");
        // some operations
        try {
            String result = future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
