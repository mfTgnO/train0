package spring_recipes_4th.ch02.reuseaspectpointcut_ii;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorPointcuts {
    @Pointcut("execution(* *.*(..))")
    public void loggingOperation() {

    }
}
