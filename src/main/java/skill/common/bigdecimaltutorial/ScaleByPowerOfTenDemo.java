package skill.common.bigdecimaltutorial;

import java.math.BigDecimal;

/*It returns the BigDecimal with the value (this * 10n). */
public class ScaleByPowerOfTenDemo {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        BigDecimal b1 = new BigDecimal("12.5");
        System.out.println("Result:" + b1.scaleByPowerOfTen(4));
    }
}
