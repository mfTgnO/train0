package springrecipes.ch03.handleformswithcontrollers_i.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExtensionInterceptor extends HandlerInterceptorAdapter {
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // Report date is present in request
        String reportName = null;
        String reportDate = request.getQueryString().replace("date=", "").replace("-", "_");
        if (request.getServletPath().endsWith(".pdf")) {
            reportName = "ReservationSummary_" + reportDate + ".pdf";
        }
        if (request.getServletPath().endsWith(".xls")) {
            reportName = "ReservationSummary_" + reportDate + ".xls";
        }
        // ONLY if its a PDF or XLS extension rewrite response URL
        // If reportName name was modified, its PDF or XLS
        if (reportName != null) {
            // Set "Content-Disposition" HTTP Header so a user gets a pretty 'Save as' address
            response.setHeader("Content-Disposition", "attachment;filename" + reportName);
        }
        super.postHandle(request, response, handler, modelAndView);
    }
}
