package skill.common.bigdecimaltutorial;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

// It returns a BigDecimal with absolute value of a given BigDecimal. We can also pass MathContext as an argument that
// will return result with rounding.
public class AbsDemo {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        BigDecimal b1 = new BigDecimal("-234.54");
        System.out.println(b1.abs());
        BigDecimal b2 = new BigDecimal("-100.124");
        System.out.println(b2.abs());

        // Using MathContext
        MathContext mc = new MathContext(2, RoundingMode.CEILING);
        BigDecimal b3 = new BigDecimal("654.75");
        System.out.println(b3.abs(mc));
    }
}