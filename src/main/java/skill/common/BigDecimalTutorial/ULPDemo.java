package skill.common.BigDecimalTutorial;

import java.math.BigDecimal;

/*It returns BigDecimal with ULP(Unit in the last place) */
public class ULPDemo {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        BigDecimal b1 = new BigDecimal("234.87");
        System.out.println("ULP of 234.87 : " + b1.ulp());

        BigDecimal b2 = new BigDecimal("1234");
        System.out.println("ULP of 234.87 : " + b2.ulp());
    }
}

