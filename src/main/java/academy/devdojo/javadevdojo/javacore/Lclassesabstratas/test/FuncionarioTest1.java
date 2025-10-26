package academy.devdojo.javadevdojo.javacore.Lclassesabstratas.test;

import academy.devdojo.javadevdojo.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.javadevdojo.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.javadevdojo.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest1 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
