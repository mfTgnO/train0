package spring_recipes_4th.ch05.handlerequestsasynchronously.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import spring_recipes_4th.ch03.domain.Reservation;
import spring_recipes_4th.ch03.domain.SportType;

public interface ReservationService {
    Flux<Reservation> query(String query);

    Flux<Reservation> findAll();

    Flux<SportType> getAllSportTypes();

    Mono<Reservation> make(Reservation reservation);

    SportType getSportType(int sportTypeId);
}
