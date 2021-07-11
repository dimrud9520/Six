package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    private CarDao carDao=new CarDaoImpl();
    @Override
    public List<Car> getCar(int number) {
        List<Car> list=new ArrayList<>();
        for(int i=0;i<number;i++){
            list.add(carDao.getCarsList().get(i));
        }
        return list;
    }
}
