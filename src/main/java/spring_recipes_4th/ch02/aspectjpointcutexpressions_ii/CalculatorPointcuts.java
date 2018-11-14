package spring_recipes_4th.ch02.aspectjpointcutexpressions_ii;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CalculatorPointcuts {
    @Pointcut("within(spring_recipes_4th.ch02.aspectjpointcutexpressions_ii.LoggingRequired)")
    public void loggingOperation() {

    }
}