package academy.devdojo.javadevdojo.javacore.Bintrodrucaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("-------------------------------");

        System.out.println(estudante.name);
        System.out.println(estudante.genre);
        System.out.println(estudante.age);
    }
}
