package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class CarServiceImp implements CarService{
    private List<Car> cars = Arrays.asList(
            new Car(1, "BMW", "Red"),
            new Car(2, "BMW", "Blue"),
            new Car(3, "Civic", "White"),
            new Car(4, "Camry", "Black"),
            new Car(5, "BMW", "Green")
    );

    @Override
    public List<Car> getCars(int count) {
        if (count>=cars.size()){
            return cars;
        }else {
            return cars.subList(0,count);
        }
    }
}
