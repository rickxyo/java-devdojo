package academy.devdojo.javadevdojo.javacore.Npolimorfismo.test;

import academy.devdojo.javadevdojo.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.javadevdojo.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

    }
}
