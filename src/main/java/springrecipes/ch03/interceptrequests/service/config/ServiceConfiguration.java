package springrecipes.ch03.interceptrequests.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springrecipes.ch03.interceptrequests.service.ReservationService;
import springrecipes.ch03.interceptrequests.service.ReservationServiceImpl;

@Configuration
public class ServiceConfiguration {
    @Bean
    public ReservationService reservationService() {
        return new ReservationServiceImpl();
    }
}
