/*
package springrecipes.ch02.joinpointinformation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorLoggingAspect {
    private Logger logger = LoggerFactory.getLogger(CalculatorConfiguration.class);

    @Before("execution(* *.*(..))")
    public void logJoinPoint(JoinPoint joinPoint) {
        logger.info("Join point kind : {}", joinPoint.getKind());
        logger.info("Signature declaring type : {}", joinPoint.getSignature().getDeclaringTypeName());
        logger.info("Signature name : {}", joinPoint.getSignature().getName());
        logger.info("Arguments : {}", joinPoint.getArgs());
        logger.info("Target class : {}", joinPoint.getTarget().getClass().getName());
        logger.info("This class : {}", joinPoint.getThis().getClass().getName());
//        System.out.println("************************");
    }
}*/
