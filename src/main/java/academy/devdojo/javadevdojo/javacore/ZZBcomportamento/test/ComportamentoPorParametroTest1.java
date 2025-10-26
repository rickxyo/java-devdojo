package academy.devdojo.javadevdojo.javacore.ZZBcomportamento.test;

import academy.devdojo.javadevdojo.javacore.ZZBcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest1 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterByColor(cars, "green"));
        System.out.println("---------");
        System.out.println(filterByYearBefore(cars, 2015));
    }

    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")){
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterByColor(List<Car> cars, String cor){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year){
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
