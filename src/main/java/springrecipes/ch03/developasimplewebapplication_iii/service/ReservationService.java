package springrecipes.ch03.developasimplewebapplication_iii.service;

import springrecipes.ch03.developasimplewebapplication_iii.domain.Reservation;

import java.util.List;

public interface ReservationService {
    List<Reservation> query(String courtName);
}
