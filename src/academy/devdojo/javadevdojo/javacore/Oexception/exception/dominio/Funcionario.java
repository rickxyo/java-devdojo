package academy.devdojo.javadevdojo.javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    public void salvar() throws LoginInvalidoException, ArithmeticException{
        System.out.println("Salvando funcionario");
    }
}
