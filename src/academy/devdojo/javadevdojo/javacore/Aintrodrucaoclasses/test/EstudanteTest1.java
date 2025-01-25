package academy.devdojo.javadevdojo.javacore.Aintrodrucaoclasses.test;

import academy.devdojo.javadevdojo.javacore.Aintrodrucaoclasses.dominio.Estudante;

public class EstudanteTest1 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Luffy";
        estudante.age = 21;
        estudante.genre = 'M';

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.genre);
    }
}
