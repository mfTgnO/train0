package skill.common.bigdecimaltutorial;

import java.math.BigDecimal;

/*This method compares the BigDecimal with given BigDecimal and returns -1, 0 or 1 as this BigDecimal is numerically
less than, equal to, or greater than given value. If the values of BigDecimal instances are equal but scales are
different, they are considered equal for compareTo() method. */
public class CompareToDemo {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        System.out.println(new BigDecimal("300.43").compareTo(new BigDecimal("150.12")));
        System.out.println(new BigDecimal("300.43").compareTo(new BigDecimal("300.43")));
        System.out.println(new BigDecimal("150.12").compareTo(new BigDecimal("300.43")));
    }
}
