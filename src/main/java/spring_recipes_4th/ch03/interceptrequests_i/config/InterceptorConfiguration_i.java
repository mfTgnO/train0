/*
package spring_recipes_4th.ch03.interceptrequests_i.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import spring_recipes_4th.ch03.interceptrequests_i.web.MeasurementInterceptor_i;

@Configuration
public class InterceptorConfiguration_i implements WebMvcConfigurer {
    @Bean
    public MeasurementInterceptor_i measurementInterceptor() {
        return new MeasurementInterceptor_i();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(measurementInterceptor());
    }
}*/
