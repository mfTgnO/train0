package spring_recipes_4th.ch02.aspectorientedprogramming_i;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class CalculatorLoggingAspect {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* *.*(..))")
//    @Before("execution(* ArithmeticCalculator.add(..))")
    public void logBefore(JoinPoint joinPoint) {
        log.info("The method {}() begins with {} ", joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()));
//        log.info("The method add() begins");
    }
}
