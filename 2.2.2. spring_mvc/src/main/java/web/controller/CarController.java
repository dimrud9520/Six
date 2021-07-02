package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;


@Controller
public class CarController {

    @GetMapping("/cars")
    public String carPage(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count == null) {
            model.addAttribute("carServ", Car.getCar(5));
        }
        if (count != null) {
            if (count >= 5) {
                model.addAttribute("carServ", Car.getCar(5));
            } else {
                model.addAttribute("carServ", Car.getCar(count));
            }
        }
        return "first/cars";
    }
}
