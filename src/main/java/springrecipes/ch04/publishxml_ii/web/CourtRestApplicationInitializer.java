package springrecipes.ch04.publishxml_ii.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CourtRestApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{CourtRestApplicationInitializer.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
