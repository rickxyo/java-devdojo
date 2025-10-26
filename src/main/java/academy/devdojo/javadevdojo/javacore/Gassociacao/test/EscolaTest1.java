package academy.devdojo.javadevdojo.javacore.Gassociacao.test;

import academy.devdojo.javadevdojo.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.javadevdojo.javacore.Gassociacao.dominio.Professor;

public class EscolaTest1 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
