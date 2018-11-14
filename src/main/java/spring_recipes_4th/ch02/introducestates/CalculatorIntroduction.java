package spring_recipes_4th.ch02.introducestates;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorIntroduction {
    @DeclareParents(value = "spring_recipes_4th.ch02.introducestates.ArithmeticCalculatorImpl", defaultImpl = MaxCalculatorImpl.class)
    public MaxCalculator maxCalculator;

    @DeclareParents(value = "spring_recipes_4th.ch02.introducestates.ArithmeticCalculatorImpl", defaultImpl = MinCalculatorImpl.class)
    public MinCalculator minCalculator;

    @DeclareParents(value = "spring_recipes_4th.ch02.introducestates.*CalculatorImpl", defaultImpl = CounterImpl.class)
    public Counter counter;

    @After("execution(* spring_recipes_4th.ch02.introducestates.*CalculatorImpl.*(..)) && this(counter)")
    public void increaseCount(Counter counter) {
        counter.increase();
    }
}
