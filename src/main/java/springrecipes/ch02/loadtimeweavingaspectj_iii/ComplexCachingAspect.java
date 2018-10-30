package springrecipes.ch02.loadtimeweavingaspectj_iii;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Aspect
public class ComplexCachingAspect {
    private Map<String, Complex> cache;

    public void complexCacheAspect() {
        cache = Collections.synchronizedMap(new HashMap<>());
    }

    @Around("call(public Complex.new(int,int)) && args(a,b)")
    public Object cacheAround(ProceedingJoinPoint joinPoint, int a, int b) throws Throwable {
        String key = a + "," + b;
        Complex complex = cache.get(key);
        if (complex == null) {
            System.out.println("Cache MISS for (" + key + ")");
            complex = (Complex) joinPoint.proceed();
            cache.put(key, complex);
        } else {
            System.out.println("Cache HIT for (" + key + ")");
        }
        return complex;
    }
}