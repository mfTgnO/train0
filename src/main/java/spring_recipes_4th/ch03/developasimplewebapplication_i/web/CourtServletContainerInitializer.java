/*
package spring_recipes_4th.ch03.developasimplewebapplication_i.web;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import spring_recipes_4th.ch03.developasimplewebapplication_i.config.CourtConfiguration;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.Set;

*/
/**
 * {@link ServletContainerInitializer} implementation to bootstrap the {@link DispatcherServlet}.
 *//*

public class CourtServletContainerInitializer implements ServletContainerInitializer {
    public static final String MSG = "Starting Court Web Application";

    public void onStartup(Set<Class<?>> set, ServletContext ctx) throws ServletException {
        System.out.println(MSG);

        ctx.log(MSG);

        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(CourtConfiguration.class);
        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
        ServletRegistration.Dynamic servletRegistration = ctx.addServlet("court", dispatcherServlet);
        servletRegistration.setLoadOnStartup(1);
        servletRegistration.addMapping("/");
    }
}
*/
