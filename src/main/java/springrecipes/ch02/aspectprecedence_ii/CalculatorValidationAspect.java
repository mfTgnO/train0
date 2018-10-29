package springrecipes.ch02.aspectprecedence_ii;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(0)
public class CalculatorValidationAspect {
    private Logger logger = LoggerFactory.getLogger(CalculatorValidationAspect.class);

    @Before("execution(* *.*(double ,double ))")
    public void validateBefore(JoinPoint joinPoint) {
        for (Object arg : joinPoint.getArgs()) {
            validate((Double) arg);
        }
    }

    private void validate(Double s) {
        if (s < 0) {
            throw new IllegalArgumentException("Positive numbers only");
        }
    }
}