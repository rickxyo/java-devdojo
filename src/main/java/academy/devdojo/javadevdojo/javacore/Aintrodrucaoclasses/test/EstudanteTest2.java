package academy.devdojo.javadevdojo.javacore.Aintrodrucaoclasses.test;

import academy.devdojo.javadevdojo.javacore.Aintrodrucaoclasses.dominio.Estudante;

public class EstudanteTest2 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.name = "Sanji";
        System.out.println(estudante.age);
        System.out.println(estudante.genre);
        System.out.println(estudante.name);

        System.out.println("------------------------------");

        System.out.println(estudante2.age);
        System.out.println(estudante2.genre);
        System.out.println(estudante2.name);
    }
}
