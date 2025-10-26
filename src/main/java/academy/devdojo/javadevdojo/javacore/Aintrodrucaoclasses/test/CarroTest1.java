package academy.devdojo.javadevdojo.javacore.Aintrodrucaoclasses.test;

import academy.devdojo.javadevdojo.javacore.Aintrodrucaoclasses.dominio.CarroExercicio;

public class CarroTest1 {
    public static void main(String[] args) {
        CarroExercicio carro = new CarroExercicio();
        CarroExercicio carro2 = new CarroExercicio();

        carro.name = "Corolla";
        carro.model = "Altis";
        carro.year = 2024;
        System.out.println(carro.name);
        System.out.println(carro.model);
        System.out.println(carro.year);

        System.out.println("-----------------");

        carro2.name = "Civic";
        carro2.model = "Touring";
        carro2.year = 2024;
        System.out.println(carro2.name);
        System.out.println(carro2.model);
        System.out.println(carro2.year);
    }
}
