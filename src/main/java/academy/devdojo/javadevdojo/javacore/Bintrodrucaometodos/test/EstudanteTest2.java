package academy.devdojo.javadevdojo.javacore.Bintrodrucaometodos.test;

import academy.devdojo.javadevdojo.javacore.Bintrodrucaometodos.dominio.Estudante;

public class EstudanteTest2 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.name = "Midoriya";
        estudante.age = 15;
        estudante.genre = 'M';

        estudante2.name = "Sakura";
        estudante2.age = 16;
        estudante2.genre = 'F';

        estudante.imprime();
        estudante2.imprime();
    }
}
