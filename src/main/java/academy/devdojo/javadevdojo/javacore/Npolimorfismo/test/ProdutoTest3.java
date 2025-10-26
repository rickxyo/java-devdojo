package academy.devdojo.javadevdojo.javacore.Npolimorfismo.test;

import academy.devdojo.javadevdojo.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.javadevdojo.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.javadevdojo.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.javadevdojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest3 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 7 5700x3d", 1600);

        Tomate tomate = new Tomate("Tomate Americano", 20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImposto(produto);




    }
}
