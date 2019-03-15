package skill.common.bigdecimaltutorial;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/*divide() method divides the calling BigDecimal by given BigDecimal instance. According to java doc "if the exact
quotient cannot be represented (because it has a non-terminating decimal expansion) an ArithmeticException is thrown". */
public class DivideDemo {
    public static void main(String[] args) {
        test1();
//        test2();
    }

    public static void test1() {
        BigDecimal bdec = new BigDecimal("706");
        BigDecimal bdecRes = bdec.divide(new BigDecimal("20"));
        System.out.println("Divide: " + bdecRes);
        //Using MathContext

        MathContext mc = new MathContext(4, RoundingMode.FLOOR);
        BigDecimal bdecMath = bdec.divide(new BigDecimal("20"), mc);
        System.out.println("Divide using MathContext: " + bdecMath);
    }

//    Exception in thread "main" java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
    public static void test2(){
        BigDecimal b = new BigDecimal("7");
        BigDecimal bdecRes = b.divide(new BigDecimal("3"));
        System.out.println("Divide: " + bdecRes);
    }
}
