package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {
    private List<Car> carList;
    {
        carList = new ArrayList<>();

        carList.add(new Car("lada", 2109, 1996));
        carList.add(new Car("uaz", 469, 2015));
        carList.add(new Car("bmv", 5, 2006));
        carList.add(new Car("toyota", 600, 2012));
        carList.add(new Car("peugeot", 308, 2009));
    }

    public List<Car> getCars(){
        return carList;
    }

    public List<Car> getCarsCount(int count){
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}