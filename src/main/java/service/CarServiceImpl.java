package service;

import model.Car;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    private final List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("Lamborghini", "Yellow", 2000));
        cars.add(new Car("BMW", "Red", 2022));
        cars.add(new Car("Toyota", "Yellow", 20123));
        cars.add(new Car("Lada", "Blue", 24345));
        cars.add(new Car("Toyota", "Brown", 243));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count <= 5) {
            return cars.stream().limit(count).collect(Collectors.toList());
        } else {
            return cars;
        }
    }
}
