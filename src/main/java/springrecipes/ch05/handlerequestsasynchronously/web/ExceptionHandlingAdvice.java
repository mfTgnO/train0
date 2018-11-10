package springrecipes.ch05.handlerequestsasynchronously.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import springrecipes.ch05.ReservationNotAvailableException;

@ControllerAdvice
public class ExceptionHandlingAdvice {
    @ExceptionHandler(ReservationNotAvailableException.class)
    public String handle() {
        return "reservationNotAvailable";
    }

    @ExceptionHandler
    public String handleDefault() {
        return "error";
    }
}
