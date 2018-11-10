package springrecipes.ch05.handlerequestsasynchronously.web;

import java.util.Date;

public class ReservationWebException extends RuntimeException {
    public static final long serialVersionUID = 1L;
    private String message;
    private String stack;
    private Date date;

    public ReservationWebException(String message, Date date, String stack) {
        this.message = message;
        this.stack = stack;
        this.date = date;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getStack() {
        return stack;
    }

    public Date getDate() {
        return date;
    }
}
