package spring_recipes_4th.ch02.useaopforintroductions;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorIntroduction {
    @DeclareParents(value = "spring_recipes_4th.ch02.useaopforintroductions.ArithmeticCalculatorImpl", defaultImpl = MaxCalculatorImpl.class)
    public MaxCalculator maxCalculator;

    @DeclareParents(value = "spring_recipes_4th.ch02.useaopforintroductions.ArithmeticCalculatorImpl", defaultImpl = MinCalculatorImpl.class)
    public MinCalculator minCalculator;
}
