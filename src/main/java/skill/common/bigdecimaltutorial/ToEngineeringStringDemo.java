package skill.common.bigdecimaltutorial;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/*It returns BigDecimal with Engineering notation
 * Engineering notation
 * https://en.wikipedia.org/wiki/Engineering_notation
 * */

public class ToEngineeringStringDemo {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        MathContext mc = new MathContext(2, RoundingMode.CEILING);
        BigDecimal bdec = new BigDecimal("234.78", mc);
        System.out.println("Result:" + bdec);
        System.out.println("Result with toEngineeringString(): " + bdec.toEngineeringString());
    }
}
