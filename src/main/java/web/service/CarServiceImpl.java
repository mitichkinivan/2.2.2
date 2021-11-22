package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> carList = new ArrayList<>();

    public CarServiceImpl() {
        carList.add(new Car("lada", 2109, 1996));
        carList.add(new Car("uaz", 469, 2015));
        carList.add(new Car("bmv", 5, 2006));
        carList.add(new Car("toyota", 600, 2012));
        carList.add(new Car("peugeot", 308, 209));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}