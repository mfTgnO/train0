package skill.common.bigdecimaltutorial;

import java.math.BigDecimal;

/*min() returns the BigDecimal with minimum value and max() returns the BigDecimal with maximum value between the two BigDecimal instances. */
public class MinMaxDemo {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        System.out.println("Min:" + new BigDecimal("300.34").min(new BigDecimal("150.67")));
        System.out.println("Max:" + new BigDecimal("300.34").max(new BigDecimal("150.67")));
    }
}