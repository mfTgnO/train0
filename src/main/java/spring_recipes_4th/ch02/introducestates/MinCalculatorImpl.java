package spring_recipes_4th.ch02.introducestates;

public class MinCalculatorImpl implements MinCalculator {
    @Override
    public double min(double a, double b) {
        double result = (a <= b) ? a : b;
        System.out.println("min(" + a + ", " + b + ") = " + result);
        return result;
    }
}
