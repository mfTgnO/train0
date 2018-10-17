package skill.common.BigDecimalTutorial;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/*
 * Example of MathContext in Java
 * https://www.concretepage.com/java/example_mathcontext_java
 * */
public class MathContextTest {
    public static void main(String[] args) {
        System.out.println(new BigDecimal("354.765", new MathContext(2, RoundingMode.CEILING)));
        System.out.println(new BigDecimal("354.765", new MathContext(2, RoundingMode.DOWN)));
        System.out.println(new BigDecimal("354.765", new MathContext(1, RoundingMode.FLOOR)));
        System.out.println(new BigDecimal("354.765", new MathContext(3, RoundingMode.HALF_EVEN)));
        System.out.println(new BigDecimal("354.765", new MathContext(3, RoundingMode.HALF_UP)));
        System.out.println(new BigDecimal("354.765", new MathContext(1, RoundingMode.UP)));
    }
}
