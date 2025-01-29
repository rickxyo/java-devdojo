package academy.devdojo.javadevdojo.javacore.Hheranca.teste;

import academy.devdojo.javadevdojo.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.javadevdojo.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.javadevdojo.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest1 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setCep("123456-789");
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Toyohisa Shimazu");
        pessoa.setCpf("1111111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setName("Oda Nobunaga");
        funcionario.setCpf("222222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(100000);
        System.out.println("-----------------");
        
    }
}
