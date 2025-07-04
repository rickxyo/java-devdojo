package academy.devdojo.javadevdojo.javacore.Zgenerics.service;

import academy.devdojo.javadevdojo.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando barco disponivel...");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando Barco: "+barco);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornandoBarcoAlugado(Barco barco){
        System.out.println("Devolvendo Barco "+ barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }
}
