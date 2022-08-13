package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarService {
    private List<Car> carList;
    {
        carList=new ArrayList<>();
        carList.add(new Car("V6","pickup",2));
        carList.add(new Car("V8","crossover",5));
        carList.add(new Car("R6","sedan",5));
        carList.add(new Car("W12","sports car",2));
        carList.add(new Car("R4","cabriolet",4));
        carList.add(new Car("R5","hatchback",4));
    }
    public List<Car> allCars(int count){
        if (count==0 && count>5){
            return carList;
        }else return carList.stream().limit(count).collect(Collectors.toList());
    }
}
