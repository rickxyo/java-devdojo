package academy.devdojo.javadevdojo.javacore.Zgenerics.test;

import academy.devdojo.javadevdojo.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.javadevdojo.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest1 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornandoCarroAlugado(carro);
    }
}
