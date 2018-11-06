package springrecipes.ch03.resolveuserlocales.service;


import springrecipes.ch03.domain.Reservation;

import java.util.List;

public interface ReservationService {
    List<Reservation> query(String courtName);
}
