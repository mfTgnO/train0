package springrecipes.ch02.aspectjpointcutexpressions_iii;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoggingRequired {
}
