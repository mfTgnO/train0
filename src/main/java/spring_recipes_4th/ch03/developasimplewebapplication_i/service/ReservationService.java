package spring_recipes_4th.ch03.developasimplewebapplication_i.service;

import spring_recipes_4th.ch03.domain.Reservation;

import java.util.List;

public interface ReservationService {
    List<Reservation> query(String courtName);
}
