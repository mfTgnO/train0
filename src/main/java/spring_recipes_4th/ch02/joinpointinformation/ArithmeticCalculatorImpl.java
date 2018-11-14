package spring_recipes_4th.ch02.joinpointinformation;

import org.springframework.stereotype.Component;

@Component("arithmeticCalculator")
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

    @Override
    public double add(double a, double b) {
        double resule = a + b;
        System.out.println(a + " + " + b + " = " + resule);
        return resule;
    }

    @Override
    public double sub(double a, double b) {
        double resule = a - b;
        System.out.println(a + " - " + b + " = " + resule);
        return resule;
    }

    @Override
    public double mul(double a, double b) {
        double resule = a * b;
        System.out.println(a + " * " + b + " = " + resule);
        return resule;
    }

    @Override
    public double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        double resule = a / b;
        System.out.println(a + " / " + b + " = " + resule);
        return resule;
    }
}