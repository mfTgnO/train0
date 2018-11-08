/*
package springrecipes.ch02.aspectorientedprogramming_ii;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CalculatorConfiguration.class);

        ArithmeticCalculator arithmeticCalculator = context.getBean("arithmeticCalculator", ArithmeticCalculator.class);
        UnitCalculator unitCalculator = context.getBean("unitCalculator", UnitCalculator.class);

        arithmeticCalculator.add(1, 2);
        arithmeticCalculator.sub(4, 3);
        arithmeticCalculator.mul(2, 3);
        arithmeticCalculator.div(4, 2);

        unitCalculator.kilogramToPound(10);
        unitCalculator.kilometerToMile(5);
    }
}
*/
