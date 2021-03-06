package spring_recipes_4th.ch03.developasimplewebapplication_i.service;

import org.springframework.stereotype.Service;
import spring_recipes_4th.ch03.domain.Player;
import spring_recipes_4th.ch03.domain.Reservation;
import spring_recipes_4th.ch03.domain.SportType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ReservationServiceImpl implements ReservationService {
    public static final SportType TENNIS = new SportType(1, "Tennis");
    public static final SportType SOCCER = new SportType(2, "Soccer");
    private final List<Reservation> reservations = new ArrayList<>();

    @Override
    public List<Reservation> query(String courtName) {
        return this.reservations.stream()
                .filter(reservation -> Objects.equals(reservation.getCourtName(), courtName))
                .collect(Collectors.toList());
    }

    public ReservationServiceImpl() {
        reservations.add(new Reservation("Tennis #1", LocalDate.of(2008, 1, 14), 16,
                new Player("Roger", "N/A"), TENNIS));
        reservations.add(new Reservation("Tennis #2", LocalDate.of(2008, 1, 14), 20,
                new Player("James", "N/A"), TENNIS));
    }
}
