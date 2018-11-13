package springrecipes.ch05.useresponsewriters.service;

import springrecipes.ch03.domain.SportType;

import java.util.ArrayList;
import java.util.List;

public class ReservationServiceImpl implements ReservationService {
    public static final SportType TENNIS = new SportType(1, "Tennis");
    public static final SportType SOCCER = new SportType(2, "Soccer");
    private final List<SportType> reservations = new ArrayList<>();

    @Override
    public List<SportType> getAllSportTypes() {
        reservations.add(TENNIS);
        reservations.add(SOCCER);
        return reservations;
    }
}
