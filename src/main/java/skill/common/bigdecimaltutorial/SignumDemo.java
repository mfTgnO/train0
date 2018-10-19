package skill.common.bigdecimaltutorial;

import java.math.BigDecimal;

/*It returns the signum function values of the BigDecimal . Signum function value for negative values
is -1 and signum function for 0 is 0 and signum function for positive value is +1. */
public class SignumDemo {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        // -1 for values < 0
        System.out.println("signum for -15.56: " + new BigDecimal("-15.56").signum());
        // 0 for value 0
        System.out.println("signum for   0.0: " + new BigDecimal("0.0").signum());
        // 1 for values > 0
        System.out.println("signum for  25.43: " + new BigDecimal("25.43").signum());
    }
}