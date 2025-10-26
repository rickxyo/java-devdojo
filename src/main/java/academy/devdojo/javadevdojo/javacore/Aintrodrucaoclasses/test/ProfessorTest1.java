package academy.devdojo.javadevdojo.javacore.Aintrodrucaoclasses.test;

import academy.devdojo.javadevdojo.javacore.Aintrodrucaoclasses.dominio.Professor;

public class ProfessorTest1 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Mestre kami";
        professor.age = 140;
        professor.genre = 'M';

        System.out.println(professor.name + " " + professor.age + " " + professor.genre);
    }
}
