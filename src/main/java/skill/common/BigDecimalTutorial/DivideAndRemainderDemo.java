package skill.common.BigDecimalTutorial;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/*It returns an array of BigDecimal of the result of divide() and remainder() method for the two BigDecimal instances. */
public class DivideAndRemainderDemo {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        BigDecimal bdec = new BigDecimal("123.56");
        MathContext mc = new MathContext(2, RoundingMode.FLOOR);
        BigDecimal[] bdecRes = bdec.divideAndRemainder(new BigDecimal("23.43"), mc);
        System.out.println("a/b: " + bdecRes[0]);
        System.out.println("a % b: " + bdecRes[1]);
    }
}
