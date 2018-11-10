package springrecipes.ch05.handlerequestsasynchronously.web;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import springrecipes.ch03.domain.Player;
import springrecipes.ch03.domain.Reservation;
import springrecipes.ch03.domain.SportType;
import springrecipes.ch05.handlerequestsasynchronously.service.ReservationService;

import javax.validation.Valid;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

@ControllerAdvice
// Bind controller to URL /reservationForm
// initial view will be resolved to the name returned in the default GET method
@RequestMapping("/reservationForm")
// Add Reservation object to session, since its created on setup and used after submission
@SessionAttributes("reservation")// Command name class was used in earlier Spring versions
public class ReservationFormController {
    private final ReservationService reservationService;

    public ReservationFormController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    /*@ModelAttribute("SportTypes")
    public List<SportType> populateSportTypes() {
        return reservationService.getAllSportTypes();
    }*/

    @GetMapping
    public String setupForm(@RequestParam(required = true, value = "username") String username, Model model) {
        Reservation reservation = new Reservation();
        reservation.setPlayer(new Player(username, null));
        model.addAttribute("reservation", reservation);
        return "reservationForm";
    }

    @PostMapping
    public Callable<String> submitForm(@ModelAttribute("reservation") @Valid Reservation reservation, BindingResult result, SessionStatus status) {
        return () -> {
            if (result.hasErrors()) {
                return "reservationForm";
            } else {
                // Simulate a slow service call
                Thread.sleep(new Random().nextInt(10) * 120);
                reservationService.make(reservation);
                status.setComplete();
                return "redirect:reservationSuccess";
            }
        };
    }
}
