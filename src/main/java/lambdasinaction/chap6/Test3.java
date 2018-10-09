package lambdasinaction.chap6;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;
import static lambdasinaction.chap6.Dish.menu;

//6.3. Grouping
public class Test3 {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
        test5();
    }

    public enum CaloricLevel {DIET, NORMAL, FAT}

    public static void test1() {
        Map<Dish.Type, List<Dish>> dishesByType = menu.stream()
                .collect(groupingBy(Dish::getType));
        System.out.println(dishesByType);
    }

    /*For
instance, you could decide to classify as “diet” all dishes with 400 calories or fewer, set to
“normal” the dishes having between 400 and 700 calories, and set to “fat” the ones with more
than 700 calories.*/
    public static void test2() {
        Map<CaloricLevel, List<Dish>> dishesByCaloricLevel = menu.stream()
                .collect(groupingBy(dish -> {
                    if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                    else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                    else return CaloricLevel.FAT;
                }));
        System.out.println(dishesByCaloricLevel);
    }

    //    6.3.1. Multilevel grouping
    public static void test3() {
        Map<Dish.Type, Map<CaloricLevel, List<Dish>>> dishesByCaloricLevel = menu.stream()
                .collect(groupingBy(Dish::getType, groupingBy(dish -> {
                            if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                            else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                            else return CaloricLevel.FAT;
                        })
                ));
        System.out.println(dishesByCaloricLevel);
    }

    /*For instance, it’s
possible to count the number of Dishes in the menu for each type, by passing the counting
collector as a second argument to the groupingBy collector:*/
    public static void test4() {
        Map<Dish.Type, Long> counting = menu.stream()
                .collect(groupingBy(Dish::getType, counting()));
        System.out.println(counting);
    }

    //    find the highest-calorie dish in the menu
    public static void test5() {
        Map<Dish.Type, Optional<Dish>> maxCalories = menu.stream()
                .collect(groupingBy(Dish::getType, maxBy(Comparator.comparingInt(Dish::getCalories))));
        System.out.println(maxCalories);
    }
}
