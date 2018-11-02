package springrecipes.ch03.handleformswithcontrollers_i.service;

import java.util.Date;

public class ReservationNotAvailableException extends RuntimeException{
    private String courtName;
    private Date date;
    private int hour;

    public ReservationNotAvailableException() {
    }

    public ReservationNotAvailableException(String courtName, Date date, int hour) {
        this.courtName = courtName;
        this.date = date;
        this.hour = hour;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "ReservationNotAvailableException{" +
                "courtName='" + courtName + '\'' +
                ", date=" + date +
                ", hour=" + hour +
                '}';
    }
}
