package skill.common.bigdecimaltutorial;

import java.math.BigDecimal;

/*This method checks for equality of a BigDecimal with a given BigDecimal. If the values of
BigDecimal instances are equal but scales are different, they are not considered as equal by equals() method. */
public class EqualsDemo {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        System.out.println(new BigDecimal("300.34").equals(new BigDecimal("150.67")));
        System.out.println(new BigDecimal("140.78").equals(new BigDecimal("140.78")));
    }
}
