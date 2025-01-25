package academy.devdojo.javadevdojo.javacore.Bintrodrucaometodos.test;

import academy.devdojo.javadevdojo.javacore.Bintrodrucaometodos.dominio.Estudante;
import academy.devdojo.javadevdojo.javacore.Bintrodrucaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest1 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.name = "Midoriya";
        estudante.age = 15;
        estudante.genre = 'M';

        estudante2.name = "Sakura";
        estudante2.age = 16;
        estudante2.genre = 'F';

        impressora.imprime(estudante);
        impressora.imprime(estudante2);
    }
}
