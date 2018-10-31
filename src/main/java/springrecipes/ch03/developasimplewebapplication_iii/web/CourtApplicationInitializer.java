package springrecipes.ch03.developasimplewebapplication_iii.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import springrecipes.ch03.developasimplewebapplication_iii.service.config.ServiceConfiguration;
import springrecipes.ch03.developasimplewebapplication_iii.web.config.WebConfiguration;

public class CourtApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ServiceConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/","/welcome"};
    }
}
