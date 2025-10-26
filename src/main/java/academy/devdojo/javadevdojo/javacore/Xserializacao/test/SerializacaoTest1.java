package academy.devdojo.javadevdojo.javacore.Xserializacao.test;

import academy.devdojo.javadevdojo.javacore.Xserializacao.dominio.Aluno;
import academy.devdojo.javadevdojo.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest1 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Pedro", "123412121");
        Turma turma = new Turma("Maratona Java");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno){
        // aluno sera SERIALIZADO dentro do path abaixo
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void deserializar(){
        // aluno sera SERIALIZADO dentro do path abaixo
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
           Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
