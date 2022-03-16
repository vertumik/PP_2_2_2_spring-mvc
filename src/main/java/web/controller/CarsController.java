package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @GetMapping
    public String getCars(ModelMap model){
        model.addAttribute("cars", new CarService().getCars());
        return "cars";
    }
}