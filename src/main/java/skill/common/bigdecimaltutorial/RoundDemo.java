package skill.common.bigdecimaltutorial;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/*It rounds a BigDecimal according to a given MathContext. */
public class RoundDemo {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        MathContext mc = new MathContext(2, RoundingMode.CEILING);
        System.out.println("scale for 0.0 : " + new BigDecimal("0.0").round(mc));
        System.out.println("scale for 134.23: " + new BigDecimal("134.23").round(mc));
        System.out.println("scale for -13.231: " + new BigDecimal("-13.231").round(mc));
    }
}
