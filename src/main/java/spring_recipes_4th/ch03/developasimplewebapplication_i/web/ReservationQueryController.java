/*
package spring_recipes_4th.ch03.developasimplewebapplication_i.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring_recipes_4th.ch03.developasimplewebapplication_i.domain.Reservation;
import spring_recipes_4th.ch03.developasimplewebapplication_i.service.ReservationService;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/reservationQuery")
// Bind controller to URL /reservationQuery
// initial view will be resolved to the name returned in the default GET method
public class ReservationQueryController {
    private final ReservationService reservationService;

    // Wire services in constructor, available in application context
    public ReservationQueryController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public void setupForm() {
        // Method is void, therefore a default view by the URL is assumed (reservationQuery)
        // (i.e.@RequestMapping(/reservationQuery))
        // Based on resolver configuration the reservationQuery view
        // will be mapped to a JSP in /WEB-INF/jsp/reservationQuery.jsp
    }

    @PostMapping
    public String submitForm(@RequestParam("courtName") String courtName, Model model) {
        // Create reservation list
        List<Reservation> reservations = Collections.emptyList();
        // Make a query if parameter is not null
        if (courtName != null) {
            reservations = reservationService.query(courtName);
        }

        // Update model to include reservations
        model.addAttribute("reservations", reservations);
        // Return view as a string
        // Based on resolver configuration the reservationQuery view
        // will be mapped to a JSP in /WEB-INF/jsp/reservationQuery.jsp
        return "reservationQuery";
    }
}
*/
