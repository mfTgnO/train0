package lambdasinaction.ch6;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.partitioningBy;

public class Test6 {
    public static void main(String[] args) {
        Map<Boolean, List<Integer>> result = partitionPrimes(4);
        System.out.println(result);
    }

    public static Map<Boolean, List<Integer>> partitionPrimes(int n) {
        /*return IntStream.rangeClosed(2, n).boxed()
                .collect(partitioningBy(candidate -> isPrime(candidate)));*/
        return IntStream.rangeClosed(2, n).boxed()
                .collect(partitioningBy(Test6::isPrime));
    }

    public static boolean isPrime(List<Integer> primes, int candidate) {
        return primes.stream()
                .noneMatch(i -> candidate % i == 0);
    }

    public static boolean isPrime(int candidate) {
        int candidateRoot = (int) Math.sqrt((double) candidate);
        return IntStream.rangeClosed(2, candidateRoot)
                .noneMatch(i -> candidate % i == 0);
    }
}
