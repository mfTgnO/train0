package lambdasinaction.chap6;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;
import static lambdasinaction.chap6.Dish.menu;

public class Partitioning {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }


    // partitionByVegeterian
    public static void test1() {
        Map<Boolean, List<Dish>> collect = menu.stream()
                .collect(partitioningBy(Dish::isVegetarian));
        System.out.println(collect);
    }

    // vegetarianDishesByType
    public static void test2() {
        Map<Boolean, Map<Dish.Type, List<Dish>>> collect = menu.stream()
                .collect(partitioningBy(Dish::isVegetarian, groupingBy(Dish::getType)));
        System.out.println(collect);
    }

    //
    public static void test3() {
        Map<Boolean, Dish> collect = menu.stream()
                .collect(partitioningBy(Dish::isVegetarian, collectingAndThen(maxBy(Comparator.comparing(Dish::getCalories)), Optional::get)));
        System.out.println(collect);
    }
}
