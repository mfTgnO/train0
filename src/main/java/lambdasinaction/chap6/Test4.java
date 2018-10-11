package lambdasinaction.chap6;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;
import static lambdasinaction.chap6.Dish.menu;

public class Test4 {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
        test5();
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
}
