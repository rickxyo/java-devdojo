package academy.devdojo.javadevdojo.javacore.Zgenerics.test;

import academy.devdojo.javadevdojo.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.javadevdojo.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.javadevdojo.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest3 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês...");
        rentalServiceCarro.retornandoObjetoAlugado(carro);

        System.out.println("---------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o barco por um mês...");
        rentalServiceBarco.retornandoObjetoAlugado(barco);
    }

}
