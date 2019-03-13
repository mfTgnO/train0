/*
package spring_recipes_4th.ch03.handleformswithcontrollers_i.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import spring_recipes_4th.ch03.domain.Reservation;
import spring_recipes_4th.ch03.interceptrequests_i.service.ReservationService;

import java.util.collectionsdemo;
import java.util.List;

@Controller
@RequestMapping("reservationQuery")
public class ReservationQueryController {
    private final ReservationService reservationService;

    public ReservationQueryController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public void setupForm() {

    }

    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(@RequestParam("courtName") String courtName, Model model) {
        List<Reservation> reservations = collectionsdemo.emptyList();
        if (courtName != null) {
            reservations = reservationService.query(courtName);
        }
        model.addAttribute("reservations", reservations);
        return "reservationQuery";
    }
}
*/
