package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private List<Car> list;
    {
        list = new ArrayList<>();
        list.add(new Car("Lada", "red", 6));
        list.add(new Car("Porsche", "black", 911));
        list.add(new Car("BMW", "green", 735));
        list.add(new Car("Mercedes", "white", 320));
        list.add(new Car("Audi", "red", 7));
    }
    public List<Car> getCars() {
        return list;
    }

    public List<Car> getNumber(int number) {
        if (number < 1 || number > 5){
            return list;
        }else {
            return list.stream().limit(number).collect(Collectors.toList());
        }
    }
}
