package skill.common.bigdecimaltutorial;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/*It returns the BigDecimal as remainder of the operation a % b. We can also pass MathContext as an argument to get rounded result. */
public class RemainderDemo {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        BigDecimal bdec = new BigDecimal("700.588");
        MathContext mc = new MathContext(2, RoundingMode.CEILING);
        BigDecimal bdecMath = bdec.remainder(new BigDecimal("21.46"), mc);
        System.out.println("a % b using MathContext : " + bdecMath);
    }
}
