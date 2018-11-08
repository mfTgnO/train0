/*
package springrecipes.ch03.handleformswithcontrollers_i.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import springrecipes.ch03.handleformswithcontrollers_i.service.ReservationNotAvailableException;

@ControllerAdvice
public class ExceptionHandlingAdvice {
    @ExceptionHandler(ReservationNotAvailableException.class)
    public String handle(ReservationNotAvailableException ex) {
        return "reservationNotAvailable";
    }

    @ExceptionHandler
    public String handleDefault(Exception e) {
        return "error";
    }
}
*/
