package springrecipes.ch02.useaopforintroductions;

public class MaxCalculatorImpl implements MaxCalculator {
    public double max(double a, double b) {
        double result = (a >= b) ? a : b;
        System.out.println("max(" + a + ", " + b + ") = " + result);
        return result;
    }
}
