package academy.devdojo.javadevdojo.javacore.Bintrodrucaometodos.test;

import academy.devdojo.javadevdojo.javacore.Bintrodrucaometodos.dominio.Funcionario;

public class FuncionarioTest1 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setName("Pedro");
        funcionario.setAge(19);
        funcionario.setSalarys(new double[]{1000, 1500, 2000});

        funcionario.imprime();

    }
}
