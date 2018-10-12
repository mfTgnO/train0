package skill.common.BigDecimalTutorial;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

// add() method adds two BigDecimal instances.
public class AddDemo {
    public static void main(String[] args) {
        BigDecimal b = new BigDecimal("234.43");
        BigDecimal bres = b.add(new BigDecimal("450.23"));
        System.out.println("Add:" + bres);

        // Using MathContext
        MathContext mc = new MathContext(2, RoundingMode.DOWN);
        BigDecimal bdecMath = b.add(new BigDecimal("450.23"), mc);
        System.out.println("Add using MathContext: " + bdecMath);
    }
}
