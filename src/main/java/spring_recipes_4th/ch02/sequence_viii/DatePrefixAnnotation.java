package spring_recipes_4th.ch02.sequence_viii;


import javax.inject.Qualifier;
import java.lang.annotation.*;

@Qualifier
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface DatePrefixAnnotation {
}
