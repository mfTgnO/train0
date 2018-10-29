package springrecipes.ch02.aspectjpointcutexpressions_ii;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CalculatorPointcuts {
    @Pointcut("within(springrecipes.ch02.aspectjpointcutexpressions_ii.LoggingRequired)")
    public void loggingOperation() {

    }
}