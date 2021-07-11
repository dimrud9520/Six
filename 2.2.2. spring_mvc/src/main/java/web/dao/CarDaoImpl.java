package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getCarsList() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", 250, "A"));
        list.add(new Car("AUDI", 300, "B"));
        list.add(new Car("OPEL", 200, "C"));
        list.add(new Car("LADA", 210, "D"));
        list.add(new Car("KIA", 310, "G"));
        return list;
    }
}
