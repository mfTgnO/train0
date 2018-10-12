package skill.common.BigDecimalTutorial;

import java.math.BigDecimal;

// It returns a BigDecimal whose value will be integer part of a/b.
public class DivideToIntegralValueDemo {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        BigDecimal bdec = new BigDecimal("706");
        BigDecimal bdecRes = bdec.divideToIntegralValue(new BigDecimal("20"));
        System.out.println("DivideToIntegralValue: " + bdecRes);
    }
}
