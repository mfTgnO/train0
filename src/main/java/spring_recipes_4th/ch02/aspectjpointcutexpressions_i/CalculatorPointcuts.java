package spring_recipes_4th.ch02.aspectjpointcutexpressions_i;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorPointcuts {
    @Pointcut("@annotation(spring_recipes_4th.ch02.aspectjpointcutexpressions_i.LoggingRequired)")
    public void loggingOperation() {
    }
}
