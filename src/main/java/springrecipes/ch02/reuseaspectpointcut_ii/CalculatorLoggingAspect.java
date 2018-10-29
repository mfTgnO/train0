package springrecipes.ch02.reuseaspectpointcut_ii;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import springrecipes.ch02.aspectprecedence_ii.CalculatorValidationAspect;

import java.util.Arrays;

@Aspect
@Component
public class CalculatorLoggingAspect {
    private Logger logger = LoggerFactory.getLogger(CalculatorValidationAspect.class);

    @Before("springrecipes.ch02.reuseaspectpointcut_ii.CalculatorPointcuts.loggingOperation()")
    public void logBefore(JoinPoint joinPoint) {
        logger.info("The method " + joinPoint.getSignature().getName()
                + "() begins with " + Arrays.toString(joinPoint.getArgs()));
    }

    @After("springrecipes.ch02.reuseaspectpointcut_ii.CalculatorPointcuts.loggingOperation()")
    public void logAfter(JoinPoint joinPoint) {
        logger.info("The method " + joinPoint.getSignature().getName()
                + "() ends");
    }

    @AfterReturning(pointcut = "springrecipes.ch02.reuseaspectpointcut_ii.CalculatorPointcuts.loggingOperation()",
            returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        logger.info("The method " + joinPoint.getSignature().getName()
                + "() ends with " + result);
    }

    @AfterThrowing(pointcut = "springrecipes.ch02.reuseaspectpointcut_ii.CalculatorPointcuts.loggingOperation()",
            throwing = "e")
    public void logAfterThrowing(JoinPoint joinPoint, IllegalArgumentException e) {
        logger.error("Illegal argument " + Arrays.toString(joinPoint.getArgs())
                + " in " + joinPoint.getSignature().getName() + "()");
    }

    @Around("springrecipes.ch02.reuseaspectpointcut_ii.CalculatorPointcuts.loggingOperation()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("The method " + joinPoint.getSignature().getName()
                + "() begins with " + Arrays.toString(joinPoint.getArgs()));
        try {
            Object result = joinPoint.proceed();
            logger.info("The method " + joinPoint.getSignature().getName()
                    + "() ends with " + result);
            return result;
        } catch (IllegalArgumentException e) {
            logger.error("Illegal argument "
                    + Arrays.toString(joinPoint.getArgs()) + " in "
                    + joinPoint.getSignature().getName() + "()");
            throw e;
        }
    }
}
