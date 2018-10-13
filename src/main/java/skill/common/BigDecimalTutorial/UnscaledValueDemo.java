package skill.common.BigDecimalTutorial;

import java.math.BigDecimal;

/*It calculates the unscaled value of a given BigDecimal. It computes this * 10^this.scale(). */
public class UnscaledValueDemo {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        System.out.println("scale for 0.0:" + new BigDecimal("0.0").scale());
        System.out.println("unscaledValue for 0.0 : " + new BigDecimal("0.0").unscaledValue());

        System.out.println("scale for 134.23:" + new BigDecimal("134.23").scale());
        System.out.println("unscaledValue for 134.23: " + new BigDecimal("134.23").unscaledValue());

        System.out.println("scale for -13.231:" + new BigDecimal("-13.231").scale());
        System.out.println("unscaledValue for -13.231: " + new BigDecimal("-13.231").unscaledValue());
    }
}
