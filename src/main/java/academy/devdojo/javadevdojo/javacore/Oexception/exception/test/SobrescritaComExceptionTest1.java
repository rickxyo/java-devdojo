package academy.devdojo.javadevdojo.javacore.Oexception.exception.test;

import academy.devdojo.javadevdojo.javacore.Oexception.exception.dominio.Funcionario;
import academy.devdojo.javadevdojo.javacore.Oexception.exception.dominio.LoginInvalidoException;
import academy.devdojo.javadevdojo.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
