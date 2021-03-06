/*
package spring_recipes_4th.ch02.aspectorientedprogramming_iii;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class CalculatorLoggingAspect {
    private Logger logger = LoggerFactory.getLogger(CalculatorConfiguration.class);

    @Before("execution(* *.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        logger.info("The method {}() begins with {} ", joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(pointcut = "execution(* *.*(..))", returning = "result")
    public void logAferReurning(JoinPoint joinPoint, Object result) {
        logger.info("The method {}() ends with {}", joinPoint.getSignature().getName(), result);
    }
}*/
