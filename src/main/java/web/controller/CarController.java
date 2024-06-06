package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    private final CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;// внедняем зависимость сервиса машин
    }
    @GetMapping("/cars")
    public String getCars(@RequestParam(name = "count",required = false,defaultValue = "5")
                              int count, Model model){
        List<Car> cars = carService.getCars(count);//получаем список машин из сервиса
        model.addAttribute("cars",cars);//ередача списка в модель для отображения
        return "cars";//имя представления возвращаем
    }

}
