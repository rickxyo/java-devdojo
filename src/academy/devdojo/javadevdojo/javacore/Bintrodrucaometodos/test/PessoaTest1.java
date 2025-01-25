package academy.devdojo.javadevdojo.javacore.Bintrodrucaometodos.test;

import academy.devdojo.javadevdojo.javacore.Bintrodrucaometodos.dominio.Pessoa;

public class PessoaTest1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.name = "Jiraya";
        pessoa.setName("Jiraya");
        pessoa.setAge(70);
//        pessoa.age = 70;
        System.out.println(pessoa.getName());
        System.out.println(pessoa.getAge());
    }
}
