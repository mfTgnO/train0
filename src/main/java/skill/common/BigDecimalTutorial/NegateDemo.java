package skill.common.BigDecimalTutorial;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

// It returns a BigDecimal with negative value of the original value.
public class NegateDemo {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        MathContext mc = new MathContext(2, RoundingMode.CEILING);
        
        BigDecimal bdec1 = new BigDecimal("-134.43", mc);
        System.out.println(bdec1);
        System.out.println("negate() of -134.43 :" + bdec1.negate());

        BigDecimal bdec2 = new BigDecimal("155.33", mc);
        System.out.println(bdec2);
        System.out.println("negate() of 155.33 :" + bdec2.negate());
    }
}
