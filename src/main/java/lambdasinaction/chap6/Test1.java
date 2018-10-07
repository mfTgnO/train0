package lambdasinaction.chap6;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static lambdasinaction.chap6.Dish.menu;

public class Test1 {
    public static List<Transaction> transactions = Arrays.asList(new Transaction(Currency.EUR, 1500.0),
            new Transaction(Currency.USD, 2300.0),
            new Transaction(Currency.GBP, 9900.0),
            new Transaction(Currency.EUR, 1100.0),
            new Transaction(Currency.JPY, 7800.0),
            new Transaction(Currency.CHF, 6700.0),
            new Transaction(Currency.EUR, 5600.0),
            new Transaction(Currency.USD, 4500.0),
            new Transaction(Currency.CHF, 3400.0),
            new Transaction(Currency.GBP, 3200.0),
            new Transaction(Currency.USD, 4600.0),
            new Transaction(Currency.JPY, 5700.0),
            new Transaction(Currency.EUR, 6800.0));

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
//        test6();
//        test7();
//        test8();
//        test9();
//        test10();
//        test11();
//        test12();
//        test13();
//        test15();
//        test16();
//        test17();
//        test18();
//        test19();
        test20();
    }

    public static class Transaction {
        private final Currency currency;
        private final double value;

        public Transaction(Currency currency, double value) {
            this.currency = currency;
            this.value = value;
        }

        public Currency getCurrency() {
            return currency;
        }

        public double getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "currency=" + currency +
                    ", value=" + value +
                    '}';
        }
    }

    private static void test1() {
        Map<Currency, List<Transaction>> transactionsByCurrencies = new HashMap<>();
        for (Transaction transaction : transactions) {
            Currency currency = transaction.getCurrency();
            List<Transaction> transactionsForCurrency = transactionsByCurrencies.get(currency);
            if (transactionsForCurrency == null) {
                transactionsForCurrency = new ArrayList<>();
                transactionsByCurrencies.put(currency, transactionsForCurrency);
            }
            transactionsForCurrency.add(transaction);
        }
        System.out.println(transactionsByCurrencies);
        System.out.println(transactionsByCurrencies.size());
    }

    private static void test2() {
        Map<Currency, List<Transaction>> transactionsByCurrencies = transactions.stream()
                .collect(groupingBy(Transaction::getCurrency));
        System.out.println(transactionsByCurrencies);
    }

    public enum Currency {
        EUR, USD, JPY, GBP, CHF
    }

//    6.2. Reducing and summarizing

    //    As a first simple example, let’s count the number of dishes in the menu, using the collector
//returned by the counting factory method:
    public static void test3() {
        Long howManyDishes = menu.stream()
                .collect(counting());
        System.out.println(howManyDishes);
    }

    //    You can write this far more directly as
    public static void test4() {
        long howManyDishes = menu.stream().count();
        System.out.println(howManyDishes);
    }


    //    6.2.1. Finding maximum and minimum in a stream of values
    public static void test5() {
        Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);
        Optional<Dish> mostCalorieDish = menu.stream()
                .collect(maxBy(dishCaloriesComparator));
        System.out.println(mostCalorieDish);
    }

//    6.2.2. Summarization

    /*The Collectors class provides a specific factory method for summing: Collectors .summingInt. It
accepts a function that maps an object into the int that has to be summed and returns a collector
that, when passed to the usual collect method, performs the requested summarization. So, for
instance, you can find the total number of calories in your menu list with*/
    public static void test6() {
        /*Integer totalCalories = menu.stream()
                .collect(summingInt(Dish::getCalories));*/
        Integer totalCalories = menu.stream().mapToInt(Dish::getCalories).sum();
        System.out.println(totalCalories);
    }

    //  summingLong
    public static void test7() {
        Long totalCalories = menu.stream()
                .collect(summingLong(Dish::getCalories));
        System.out.println(totalCalories);
    }

    //    summingDouble
    public static void test8() {
        Double totalCalories = menu.stream()
                .collect(summingDouble(Dish::getCalories));
        System.out.println(totalCalories);
    }

    /*But there’s more to summarization than mere summing; also available is a
Collectors .averagingInt, together with its averagingLong and averagingDouble counterparts, to
calculate the average of the same set of numeric values:*/
//    averagingInt
    public static void test9() {
        Double avgCalories = menu.stream()
                .collect(averagingInt(Dish::getCalories));
        System.out.println(avgCalories);
    }

    //    averagingLong
    public static void test10() {
        Double avgCalories = menu.stream()
                .collect(averagingLong(Dish::getCalories));
        System.out.println(avgCalories);
    }

    public static void test11() {
        Double avgCalories = menu.stream()
                .collect(averagingDouble(Dish::getCalories));
        System.out.println(avgCalories);
    }

    /*In this case, you can use the collector returned by the
summarizingInt factory method. For example, you can count the elements in the menu and
obtain the sum, average, maximum, and minimum of the calories contained in each dish with a
single summarizing operation:*/
    public static void test12() {
        IntSummaryStatistics menuStatistics = menu.stream()
                .collect(summarizingInt(Dish::getCalories));
        System.out.println(menuStatistics);
    }

//    6.2.3. Joining Strings

    /*The collector returned by the joining factory method concatenates into a single string all strings
resulting from invoking the toString method on each object in the stream. This means you can
concatenate the names of all the dishes in the menu as follows:*/
    public static void test13() {
        String shortMenu = menu.stream()
                .map(Dish::getName)
                .collect(Collectors.joining());
        System.out.println(shortMenu);
    }

    /*Note that joining internally makes use of a StringBuilder to append the generated strings into
one. Also note that if the Dish class had a toString method returning the dish’s name, you’d
obtain the same result without needing to map over the original stream with a function
extracting the name from each dish:*/
    public static void test14() {
        /*R collect = menu.stream()
                .collect(joining());*/

    }

    /*which isn’t very readable. Fortunately, the joining factory method has an overloaded version
that accepts a delimiter string between two consecutive elements, so you can obtain a
comma-separated list of the dishes’ names with*/
    public static void test15() {
        String shortMenu = menu.stream()
                .map(Dish::getName).collect(Collectors.joining(", "));
        System.out.println(shortMenu);
    }

    public static void test16() {
        /*Integer totalCalories = menu.stream()
                .collect(reducing(0, Dish::getCalories, (i, j) -> i + j));*/
//        Integer totalCalories = menu.stream().map(Dish::getCalories).reduce(0, (i, j) -> i + j);
        Integer totalCalories = menu.stream().map(Dish::getCalories).reduce(1000, (i, j) -> i + j);
        System.out.println(totalCalories);
    }

    //    highest-calorie dish
    public static void test17() {
        /*Optional<Dish> mostCalorieDish = menu.stream()
                .collect(reducing((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2));*/
        Optional<Dish> mostCalorieDish = menu.stream()
                .reduce((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2);
        System.out.println(mostCalorieDish);
    }

    //    lowest-calorie dish
    public static void test18() {
        Optional<Dish> lowest = menu.stream()
                .reduce((d1, d2) -> d1.getCalories() > d2.getCalories() ? d2 : d1);
        System.out.println(lowest);
    }

//    Collection framework flexibility: doing the same operation in different
//ways

    /*You can further simplify the previous sum example using the reducing collector by using a
reference to the sum method of the Integer class instead of the lambda expression you used to
encode the same operation. This results in the following:*/
    public static void test19() {
        /*Integer totalCalories = menu.stream()
                .collect(reducing(0, Dish::getCalories, Integer::sum));*/
        Integer totalCalories = menu.stream()
                .map(Dish::getCalories)
                .reduce(0, Integer::sum);
        System.out.println(totalCalories);
    }

    public static void test20() {
        Integer totalCalories = menu.stream()
                .map(Dish::getCalories)
                .reduce(Integer::sum)
                .get();
        System.out.println(totalCalories);
    }
}
