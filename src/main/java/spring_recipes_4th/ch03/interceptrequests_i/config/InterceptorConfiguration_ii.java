/*
package spring_recipes_4th.ch03.interceptrequests_i.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import spring_recipes_4th.ch03.interceptrequests_i.web.MeasurementInterceptor_ii;

@Configuration
public class InterceptorConfiguration_ii implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(measurementInterceptor_ii()).addPathPatterns("/welcome");
    }

    public MeasurementInterceptor_ii measurementInterceptor_ii() {
        return new MeasurementInterceptor_ii();
    }
}
*/
