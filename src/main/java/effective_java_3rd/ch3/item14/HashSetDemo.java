package effective_java_3rd.ch3.item14;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        test1();
//        test2();
//        test3();
    }

    private static void test1() {
        HashSet<BigDecimal> set = new HashSet<>();
        BigDecimal bd1 = new BigDecimal("1.0");
        BigDecimal bd2 = new BigDecimal("1.00");

        set.add(bd1);
        set.add(bd2);

        System.out.println("HashSet size:" + set.size());// HashSet size:2
    }

    private static void test2() {
        TreeSet<BigDecimal> set = new TreeSet<>();
        BigDecimal bd1 = new BigDecimal("1.0");
        BigDecimal bd2 = new BigDecimal("1.00");

        set.add(bd1);
        set.add(bd2);

        System.out.println("TreeSet size:" + set.size());// TreeSet size:1
    }

    private static void test3() {
        boolean flag;
        flag = 0 == 1;
        System.out.println(flag);
    }
}
