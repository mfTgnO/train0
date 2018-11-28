package lambdasinaction.ch6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;
import static lambdasinaction.ch6.Dish.menu;

public class Test4 {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
//        test7();
//        test8();
//        test9();
//        test11();
//        test12();
//        test13();
//        test14();
//        test15();
//        test16();
        test17();
        /*boolean flag = isPrime(4);
        System.out.println(flag);*/
    }

    /*For instance,
    if you’re vegetarian or have invited a vegetarian friend to have dinner with you, you may be
    interested in partitioning the menu into vegetarian and nonvegetarian dishes:*/
    public static void test1() {
        List<Dish> vegetarianDishes = menu.stream()
                .filter(Dish::isVegetarian)
                .collect(Collectors.toList());
        System.out.println(vegetarianDishes);
    }

    public static void test2() {
        Map<Boolean, List<Dish>> vegetarianDishes = menu.stream()
                .collect(partitioningBy(Dish::isVegetarian));
        System.out.println(vegetarianDishes);
    }

    /*6.3.1. As another example, you can reuse your earlier code to find the most caloric dish among
both vegetarian and nonvegetarian dishes:*/
    public static void test3() {
        Map<Boolean, Dish> mostCaloricPartitionedByVegetarian = menu.stream()
                .collect(partitioningBy(Dish::isVegetarian, collectingAndThen(maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get)));
        System.out.println(mostCaloricPartitionedByVegetarian);
    }

    public static void test4() {
        Map<Boolean, Map<Boolean, List<Dish>>> collect = menu.stream()
                .collect(partitioningBy(Dish::isVegetarian, partitioningBy(d -> d.getCalories() > 500)));
        System.out.println(collect);
    }

    public static void test5() {
        Map<Boolean, Long> collect = menu.stream()
                .collect(partitioningBy(Dish::isVegetarian, counting()));
        System.out.println(collect);
    }

    public static boolean isPrime(int candidate) {
        int candidateRoot = (int) Math.sqrt((double) candidate);
        return IntStream.rangeClosed(2, candidateRoot).noneMatch(i -> i % candidateRoot == 0);
    }

    /*toCollection Collection<T> Gather all the stream’s items in the collection created
by the provided supplier.*/
    public static void test6() {
//        Collection<Dish> dishes = menu.stream().collect(toCollection(), ArrayList::new);
    }

    /*counting Long Count the number of items in the stream.*/
    public static void test7() {
        Long collect = menu.stream()
                .collect(counting());
        System.out.println(collect);
    }

    /*summingInt Integer Sum the values of an Integer property of the items in
the stream.*/
    public static void test8() {
        /*Integer collect = menu.stream()
                .collect(summingInt(Dish::getCalories));*/
        Integer collect = menu.stream().mapToInt(Dish::getCalories).sum();
        System.out.println(collect);
    }

    /*averagingInt Double Calculate the average value of an Integer property of
the items in the stream.*/
    public static void test9() {
        Double collect = menu.stream()
                .collect(averagingInt(Dish::getCalories));
        System.out.println(collect);
    }

    /*summarizingInt IntSummary-Statistics Collect statistics regarding an Integer property of the
items in the stream, such as the maximum, minimum,total, and average.*/
    public static void test10() {
        IntSummaryStatistics collect = menu.stream()
                .collect(summarizingInt(Dish::getCalories));
        System.out.println(collect);
    }

    /*joining String Concatenate the strings resulting from the invocation
of the toString method on each item of the stream.*/
    public static void test11() {
        String collect = menu.stream()
                .map(Dish::getName).collect(joining(", "));
        System.out.println(collect);
    }

    /*maxBy Optional<T> An Optional wrapping the maximal element in this
stream according to the given comparator or Optional.empty() if the stream is empty.*/
    public static void test12() {
        /*Optional<Dish> collect = menu.stream()
                .collect(maxBy(Comparator.comparingInt(Dish::getCalories)));*/
        Optional<Dish> collect = menu.stream().max(Comparator.comparingInt(Dish::getCalories));
        System.out.println(collect);
    }

    /*minBy Optional<T> An Optional wrapping the minimal element in this
stream according to the given comparator or Optional.empty() if the stream is empty.*/
    public static void test13() {
        /*Optional<Dish> collect = menu.stream()
                .collect(minBy(Comparator.comparingInt(Dish::getCalories)));*/
        Optional<Dish> collect = menu.stream().min(Comparator.comparingInt(Dish::getCalories));
        System.out.println(collect);
    }

    /*reducing The type produced by the reduction operation Reduce the stream to a single value starting from an
initial value used as accumulator and iteratively combining it with each item of the stream using a BinaryOperator.*/
    public static void test14() {
        /*Integer collect = menu.stream()
                .collect(reducing(0, Dish::getCalories, Integer::sum));*/
        Integer totalCalories = menu.stream().map(Dish::getCalories).reduce(0, Integer::sum);
        System.out.println(totalCalories);
    }

    /*collectingAndThen The type returned by the transforming function
Wrap another collector and apply a transformation function to its result.*/
    public static void test15() {
        Integer howManyDishes = menu.stream()
                .collect(collectingAndThen(toList(), List::size));
        System.out.println(howManyDishes);
    }

    /*groupingBy Map<K, List<T>> Group the items in the stream based on the value of
one of their properties and use those values as keys in
the resulting Map.Returned type Used to*/
    public static void test16() {
        Map<Dish.Type, List<Dish>> dishesByType = menu.stream()
                .collect(groupingBy(Dish::getType));
        System.out.println(dishesByType);
    }

    /*partitioningBy Map<Boolean, List<T>> Partition the items in the stream based on the result of
the application of a predicate to each of them.*/
    public static void test17() {
        Map<Boolean, List<Dish>> vegetarianDishes = menu.stream()
                .collect(partitioningBy(Dish::isVegetarian));
        System.out.println(vegetarianDishes);
    }
}
