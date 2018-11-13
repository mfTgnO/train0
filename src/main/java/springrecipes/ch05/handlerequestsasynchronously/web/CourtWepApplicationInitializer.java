package springrecipes.ch05.handlerequestsasynchronously.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import springrecipes.ch05.handlerequestsasynchronously.service.config.ServiceConfiguration;
import springrecipes.ch05.handlerequestsasynchronously.web.config.WebConfiguration;

public class CourtWepApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
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
        return new String[]{"/"};
    }
}
