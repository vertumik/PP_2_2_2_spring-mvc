package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        cars.add(new Car("Lada", "red", 6));
        cars.add(new Car("Porsche", "black", 911));
        cars.add(new Car("BMW", "green", 735));
        cars.add(new Car("Mercedes", "white", 320));
        cars.add(new Car("Audi", "red", 7));
        return cars;
    }
}
