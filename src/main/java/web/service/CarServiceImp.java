package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService{
    private final List<Car> cars = new ArrayList<>();//сохраняем список машин

    public CarServiceImp() {
        cars.add(new Car(1, "Camry", "white"));
        cars.add(new Car(2, "Camry", "black"));
        cars.add(new Car(3, "Ford", "blue"));
        cars.add(new Car(4, "BMW", "white"));
        cars.add(new Car(5, "Nissan", "green"));
    } //конструктор для добавления машин в сервис

    @Override
    public List<Car> getCars(int count) {
        if (count>=cars.size()){
            return cars;
        }else {
            return cars.subList(0,count);
        }
    }
}
