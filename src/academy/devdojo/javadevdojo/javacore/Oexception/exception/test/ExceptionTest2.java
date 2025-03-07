package academy.devdojo.javadevdojo.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest2 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Problema na hora de cirar o arquivo;");
            //throw e;
        }

    }
}
