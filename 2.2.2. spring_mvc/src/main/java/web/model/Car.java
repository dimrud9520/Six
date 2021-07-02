package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private int maxSpeed;
    private String type;


    public Car() {
    }

    public Car(String model, int maxSpeed, String type) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static List<Car> getCarsList() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", 250, "A"));
        list.add(new Car("AUDI", 300, "B"));
        list.add(new Car("OPEL", 200, "C"));
        list.add(new Car("LADA", 210, "D"));
        list.add(new Car("KIA", 310, "G"));
        return list;
    }
    public static List<Car> getCar(int number){
        List<Car> list=new ArrayList<>();
        for(int i=0;i<number;i++){
            list.add(Car.getCarsList().get(i));
        }
        return list;
    }
}
