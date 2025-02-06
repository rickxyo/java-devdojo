package academy.devdojo.javadevdojo.javacore.Npolimorfismo.test;

import academy.devdojo.javadevdojo.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.javadevdojo.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.javadevdojo.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest2 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 7 5700x3d", 1600);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("---------------");
        Produto produto2 = new Tomate("Tomate Americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());


    }
}
