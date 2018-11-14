/*
package spring_recipes_4th.ch03.resolveuserlocales.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import spring_recipes_4th.ch03.resolveuserlocales.web.ExtensionInterceptor;
import spring_recipes_4th.ch03.resolveuserlocales.web.MeasurementInterceptor;

@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(measurementInterceptor());
    }

    @Bean
    public MeasurementInterceptor measurementInterceptor() {
        return new MeasurementInterceptor();
    }

    @Bean
    public ExtensionInterceptor extensionInterceptor() {
        return new ExtensionInterceptor();
    }
}
*/
