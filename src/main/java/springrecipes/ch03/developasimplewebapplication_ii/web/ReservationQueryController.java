package springrecipes.ch03.developasimplewebapplication_ii.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springrecipes.ch03.developasimplewebapplication_ii.domain.Reservation;
import springrecipes.ch03.developasimplewebapplication_ii.service.ReservationService;

import java.util.List;

@Controller
@RequestMapping("/reservationQuery")
public class ReservationQueryController {
    private final ReservationService reservationService;

    public ReservationQueryController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    // Controller will always look for a default GET method to call first, irrespective of name
    // In this case, named setupForm to ease identification
    @GetMapping
    public void setupForm() {
        // Method is void, therefore a default view by the URL is assumed (reservationQuery)
        // (i.e.@RequestMapping(/reservationQuery))
        // Based on resolver configuration the reservationQuery view
        // will be mapped to a JSP in /WEB-INF/jsp/reservationQuery.jsp
    }

    // Controller will always look for a default POST method irrespective of name
    // when a submission ocurrs on the URL (i.e.@RequestMapping(/reservationQuery))
    // In this case, named submitForm to ease identification
    @PostMapping
    // Submission will come with courtName field, also add Model to return results
    public String sumbitForm(@RequestParam("courtName") String courtName, Model model) {
        // Create reservation list
        List<Reservation> reservations = java.util.Collections.emptyList();
        // Make a query if parameter is not null
        if (courtName != null) {
            reservations = reservationService.query(courtName);
        }
        // Update model to include reservations
        model.addAttribute("reservations", reservations);
        // Return view as a string
        // Based on resolver configuration the reservationQuery view
        // will be mapped to a JSP in /WEB-INF/jsp/reservationQuery_ii.jsp
        return "reservationQuery";
    }
}