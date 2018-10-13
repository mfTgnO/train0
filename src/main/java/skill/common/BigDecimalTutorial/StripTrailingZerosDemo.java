package skill.common.BigDecimalTutorial;

import java.math.BigDecimal;

/*It strips tailing zeros and returns a BigDecimal with equal value of original BigDecimal. */
public class StripTrailingZerosDemo {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        BigDecimal b = new BigDecimal("120000.00");
        System.out.println("Result:" + b.stripTrailingZeros());
    }
}
