package academy.devdojo.javadevdojo.javacore.Npolimorfismo.servico;

import academy.devdojo.javadevdojo.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
