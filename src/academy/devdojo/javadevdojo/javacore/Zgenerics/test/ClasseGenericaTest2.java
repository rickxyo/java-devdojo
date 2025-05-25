package academy.devdojo.javadevdojo.javacore.Zgenerics.test;

import academy.devdojo.javadevdojo.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.javadevdojo.javacore.Zgenerics.service.BarcoRentavelService;

public class ClasseGenericaTest2 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelService.retornandoBarcoAlugado(barco);
    }
}
