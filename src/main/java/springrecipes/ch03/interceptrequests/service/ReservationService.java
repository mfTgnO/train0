package springrecipes.ch03.interceptrequests.service;


import springrecipes.ch03.domain.Reservation;

import java.util.List;

public interface ReservationService {
    List<Reservation> query(String courtName);
}
