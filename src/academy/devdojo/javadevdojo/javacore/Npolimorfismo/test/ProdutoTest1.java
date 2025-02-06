package academy.devdojo.javadevdojo.javacore.Npolimorfismo.test;

import academy.devdojo.javadevdojo.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.javadevdojo.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.javadevdojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest1 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);

    }
}
