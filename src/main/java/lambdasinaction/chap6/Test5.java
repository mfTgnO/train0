package lambdasinaction.chap6;

import java.util.ArrayList;
import java.util.List;

import static lambdasinaction.chap6.Dish.menu;

public class Test5 {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    public static void test1() {
        List<Dish> dishes = menu.stream()
                .collect(new ToListCollector<Dish>());
        System.out.println(dishes);
    }

    public static void test2(){
        /*List<Dish> dishes = menu.stream()
                .collect(Collectors.toList());*/
        List<Dish> dishes = new ArrayList<>(menu);
        System.out.println(dishes);
    }
}
