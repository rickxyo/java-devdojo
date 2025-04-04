package academy.devdojo.javadevdojo.javacore.Npolimorfismo.servico;

import academy.devdojo.javadevdojo.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.javadevdojo.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.javadevdojo.javacore.Npolimorfismo.dominio.Tomate;

//quando deixamos nosso metodo como static nao precisamos mais instanciar o mesmo

public class CalculadoraImposto {
//    public static void calcularImpostoComputador(Computador computador) {
//        System.out.println("Relatorio de imposto do computador");
//        double imposto = computador.calcularImposto();
//        System.out.println("Computador " + computador.getNome());
//        System.out.println("Valor do computador " + computador.getValor());
//        System.out.println("Valor do imposto " + imposto);
//    }
//
//    public static void calcularImpostoTomate(Tomate tomate) {
//        System.out.println("Relatorio de imposto do tomate");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Tomate " + tomate.getNome());
//        System.out.println("Valor do tomate " + tomate.getValor());
//        System.out.println("Valor do imposto " + imposto);
//    }

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto " + produto.getNome());
        System.out.println("Preço " + produto.getValor());
        System.out.println("Imposto " + imposto);
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}
