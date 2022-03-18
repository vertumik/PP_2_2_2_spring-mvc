package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int number, ModelMap model){
        List<Car> list = new ArrayList<>();
        list.add(new Car("Lada", "red", 6));
        list.add(new Car("Porsche", "black", 911));
        list.add(new Car("BMW", "green", 735));
        list.add(new Car("Mercedes", "white", 320));
        list.add(new Car("Audi", "red", 7));
        model.addAttribute("cars", new CarService().getCars(list, number));
        return "cars";
    }
}
