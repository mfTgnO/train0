package skill.common.BigDecimalTutorial;

import java.math.BigDecimal;

// It returns a BigDecimal with +this
public class PlusDemo {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        BigDecimal bdec1 = new BigDecimal("-134.43");
        System.out.println("plus() of -134.43 :" + bdec1.plus());
        BigDecimal bdec2 = new BigDecimal("155.33");
        System.out.println("plus() of 155.33 :" + bdec2.plus());
    }
}