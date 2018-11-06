package springrecipes.ch03.resolveuserlocales.service.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springrecipes.ch03.resolveuserlocales.service.ReservationService;
import springrecipes.ch03.resolveuserlocales.service.ReservationServiceImpl;

@Configuration
public class ServiceConfiguration {
    @Bean
    public ReservationService reservationService() {
        return new ReservationServiceImpl();
    }
}
