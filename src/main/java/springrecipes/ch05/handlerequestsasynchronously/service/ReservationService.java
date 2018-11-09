package springrecipes.ch05.handlerequestsasynchronously.service;

import reactor.core.publisher.Flux;
import springrecipes.ch03.domain.Reservation;
import springrecipes.ch03.domain.SportType;

public interface ReservationService {
    Flux<Reservation> query(String query);

    Flux<Reservation> findAll();

    Flux<SportType> getAllSportTypes();

    SportType getSportType(int sportTypeId);
}
