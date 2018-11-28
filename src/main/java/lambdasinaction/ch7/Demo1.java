package lambdasinaction.ch7;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Function;
import java.util.stream.IntStream;

import static lambdasinaction.ch7.ForkJoinSumCalculator.forkJoinSum;

public class Demo1 {
    public static void main(String[] args) {
        /*long l = iterativeSum(10);
        System.out.println(l);*/
//        test2();
//        test3();
//        test4();
//        test5();
//        test6();
//        test7();
//        test8();
        test9();
    }

    public static void test1() {
//        System.out.println("Sequential sum done in: " + measureSumPerf(ParallelStreams::sequentialSum, 10_000_000) + " msecs");
//        System.out.println("Iterative Sum done in: " + measurePerf(ParallelStreams::iterativeSum, 10_000_000L) + " msecs");
    }

    public static void test2() {
        long l = forkJoinSum(20000000);
        System.out.println(l);
    }

    public static void test3() {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        int poolSize = forkJoinPool.getPoolSize();
        System.out.println(poolSize);
    }

    public static void test4() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println(availableProcessors);
    }

    public static void test5() {
        Long aLong = 1_100_100L;
        System.out.println(aLong);
    }

    public static void test6() {
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        int poolSize = forkJoinPool.getPoolSize();
        System.out.println(poolSize);
    }

    public static void test7() {
        ForkJoinPool forkJoinPool = new ForkJoinPool(2);
        int poolSize = forkJoinPool.getPoolSize();
        System.out.println(poolSize);
    }

    public static void test8() {
        CustomRecursiveAction word = new CustomRecursiveAction("This pattern can be used to develop your own RecursiveAction classes.");
        new ForkJoinPool().invoke(word);
    }

    public static void test9() {
        int[] array = IntStream.rangeClosed(0, 100).toArray();
        System.out.println(Arrays.toString(array));
        CustomRecursiveTask customRecursiveTask = new CustomRecursiveTask(array);
        Integer sum = new ForkJoinPool().invoke(customRecursiveTask);
        System.out.println(sum);
    }

    public static long iterativeSum(long n) {
        long result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static long measurePerf(Function<Long, Long> adder, long n) {
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            Long sum = adder.apply(n);
            long duration = (System.nanoTime() - start) / 1_100_100;
            System.out.println("Result:" + sum);
            if (duration < fastest) {
                fastest = duration;
            }
        }
        return fastest;
    }
}
