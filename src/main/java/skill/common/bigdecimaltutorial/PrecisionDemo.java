package skill.common.bigdecimaltutorial;

import java.math.BigDecimal;

/*This method returns the precision of BigDecimal. */
public class PrecisionDemo {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        System.out.println("precision for 0.0 : " + new BigDecimal("0.0").precision());
        System.out.println("precision for 134.23: " + new BigDecimal("134.23").precision());
        System.out.println("precision for -13.231: " + new BigDecimal("-13.231").precision());
    }
}
