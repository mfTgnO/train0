package springrecipes.ch03.interceptrequests_i.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import springrecipes.ch03.interceptrequests_i.service.config.ServiceConfiguration;
import springrecipes.ch03.interceptrequests_i.web.config.WebConfiguration;

public class CourtWepApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ServiceConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
//        return new Class<?>[]{CourtConfiguration.class};
        return new Class<?>[]{WebConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
