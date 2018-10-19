package skill.common.bigdecimaltutorial;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

// It calculates the power of a BigDecimal value and returns a BigDecimal. The exponent will be an integer.
public class PowDemo {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        int exponent = 7;
        MathContext mc = new MathContext(2, RoundingMode.CEILING);
        BigDecimal bdec = new BigDecimal("12");
        BigDecimal bdecres = bdec.pow(exponent, mc);// 12的7次方
        System.out.println("Pow: " + bdecres);
    }
}
