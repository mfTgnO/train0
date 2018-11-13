package springrecipes.ch05.useresponsewriters.service;

import springrecipes.ch03.domain.SportType;

import java.util.List;

public interface ReservationService {
    List<SportType> getAllSportTypes();
}
