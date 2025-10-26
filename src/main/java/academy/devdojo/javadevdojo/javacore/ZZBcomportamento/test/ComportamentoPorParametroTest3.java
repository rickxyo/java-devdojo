package academy.devdojo.javadevdojo.javacore.ZZBcomportamento.test;

import academy.devdojo.javadevdojo.javacore.ZZBcomportamento.domain.Car;
import academy.devdojo.javadevdojo.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest3 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {

        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2015);
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }


}
