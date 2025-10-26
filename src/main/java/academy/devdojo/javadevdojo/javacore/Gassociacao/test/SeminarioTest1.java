package academy.devdojo.javadevdojo.javacore.Gassociacao.test;

import academy.devdojo.javadevdojo.javacore.Gassociacao.dominio.Seminario;
import academy.devdojo.javadevdojo.javacore.Gassociacao.dominio.SeminarioAluno;
import academy.devdojo.javadevdojo.javacore.Gassociacao.dominio.SeminarioLocal;
import academy.devdojo.javadevdojo.javacore.Gassociacao.dominio.SeminarioProfessor;

import java.util.Scanner;

public class SeminarioTest1 {
    public static void main(String[] args) {
        SeminarioLocal local = new SeminarioLocal("Rua teste 1");
        SeminarioAluno aluno = new SeminarioAluno("Pedro", 19);
        SeminarioProfessor professor = new SeminarioProfessor("DevDojo", "TI");

        SeminarioAluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}
